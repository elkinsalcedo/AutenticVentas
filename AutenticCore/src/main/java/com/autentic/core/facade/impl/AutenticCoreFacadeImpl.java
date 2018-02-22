/**
 * 
 */
package com.autentic.core.facade.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autentic.core.dto.CrearVentaRequestDto;
import com.autentic.core.dto.CrearVentaResponseDto;
import com.autentic.core.dto.ResultadoOperacionDto;
import com.autentic.core.dto.ResultadoVentaDto;
import com.autentic.core.dto.VentafacturaDto;
import com.autentic.core.facade.AutenticCoreFacade;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.facade.PreventaFacade;
import com.autentic.persistence.facade.PreventaproductoFacade;
import com.autentic.persistence.facade.ProductoFacade;
import com.autentic.persistence.facade.VentafacturaFacade;
import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.PreventaproductoPojo;
import com.autentic.persistence.pojo.ProductoPojo;
import com.autentic.persistence.pojo.VentafacturaPojo;
import com.autentic.persistence.util.ObjectBuilder;

/**
 * @author esalcedo
 *
 */
@Component
public class AutenticCoreFacadeImpl implements AutenticCoreFacade {
	
	@Autowired
	private PreventaproductoFacade preventaproductoFacadeImpl;
	
	@Autowired
	private VentafacturaFacade ventafacturaFacadeImpl;
	
	@Autowired
	private ProductoFacade productoFacadeImpl;
	
	@Autowired
	private PreventaFacade preventaFacadeImpl;
	
	private CrearVentaResponseDto obtenerRespuestaDto(ResultadoOperacionDto resultadoOperacionDto, VentafacturaPojo resultadoVentafacturaPojo) {
		CrearVentaResponseDto  crearVentaResponseDto = new CrearVentaResponseDto();
		crearVentaResponseDto.setResultadoOperacion(resultadoOperacionDto);
		if (null != resultadoVentafacturaPojo) {
			ResultadoVentaDto resultadoVentaDto = new ResultadoVentaDto();
			resultadoVentaDto.setIdFactura(BigInteger.valueOf(resultadoVentafacturaPojo.getId()));
			resultadoVentaDto.setValor(resultadoVentafacturaPojo.getValortotal());
			resultadoVentaDto.setLugarDespacho(resultadoVentafacturaPojo.getIdpreventa().getLugardespacho());
			crearVentaResponseDto.setResultadoVenta(resultadoVentaDto);
		}
		return crearVentaResponseDto;
	}
	
	public CrearVentaResponseDto crearVenta(@Valid CrearVentaRequestDto crearVentaRequestDto) throws Exception {
		
		PreventaproductoPojo preventaproductoPojo = new PreventaproductoPojo();
		PreventaPojo preventaPojo = new PreventaPojo();
		preventaPojo.setId(crearVentaRequestDto.getIdPreventa().intValue());
		ProductoPojo productoPojo = new ProductoPojo();
		productoPojo.setId(crearVentaRequestDto.getIdProducto().intValue());
		preventaproductoPojo.setIdpreventa(preventaPojo);
		preventaproductoPojo.setIdproducto(productoPojo);
		Integer cantidadProducto = crearVentaRequestDto.getCantidadProducto().intValue();
		preventaproductoPojo.setCantidad(cantidadProducto);
		
		double valorUnitarioProducto = 0;
		ProductoPojo resultadoProducto = productoFacadeImpl.find(productoPojo.getId());
		ResultadoOperacionDto resultadoOperacionDto = new ResultadoOperacionDto();
		if (null == resultadoProducto) {			
			resultadoOperacionDto.setCodigo(BigInteger.valueOf(401));
			resultadoOperacionDto.setMensaje("Producto no encontrado !!!");
			return obtenerRespuestaDto(resultadoOperacionDto, null);
		}
		
		valorUnitarioProducto = resultadoProducto.getValor();
		double valorProductoCantidad = cantidadProducto * valorUnitarioProducto;
		preventaproductoPojo.setValor(valorProductoCantidad);
		
		PreventaproductoPojo preventaProductoRegistroPojo = preventaproductoFacadeImpl.findByIdproductoAndIdpreventa(productoPojo, preventaPojo);
		
		if (null == preventaProductoRegistroPojo) {
			preventaproductoFacadeImpl.create(preventaproductoPojo);				
		}else {
			preventaProductoRegistroPojo.setCantidad(preventaProductoRegistroPojo.getCantidad() + cantidadProducto);
			preventaProductoRegistroPojo.setValor(preventaProductoRegistroPojo.getValor() + valorProductoCantidad);
			preventaproductoFacadeImpl.update(preventaProductoRegistroPojo);	
		}
		
		VentafacturaPojo ventafacturaPojo = ventafacturaFacadeImpl.findByIdpreventa(preventaPojo);
		VentafacturaPojo resultadoVentaFacturaPojo = null;
		
		if (null == ventafacturaPojo) {
			VentafacturaPojo ventafacturaRequestPojo = new VentafacturaPojo();
			ventafacturaRequestPojo.setIdpreventa(preventaFacadeImpl.find(preventaPojo.getId()));
			ventafacturaRequestPojo.setValortotal(valorProductoCantidad);
			ventafacturaFacadeImpl.create(ventafacturaRequestPojo);
			resultadoVentaFacturaPojo = ventafacturaRequestPojo;
		}else {
			ventafacturaPojo.setValortotal(ventafacturaPojo.getValortotal() + valorProductoCantidad);
			ventafacturaFacadeImpl.update(ventafacturaPojo);
			resultadoVentaFacturaPojo = ventafacturaPojo;
		}
		
		resultadoOperacionDto.setCodigo(BigInteger.valueOf(200));
		resultadoOperacionDto.setMensaje("Ok");
		return obtenerRespuestaDto(resultadoOperacionDto, resultadoVentaFacturaPojo);
	}

	@SuppressWarnings("unchecked")
	public List<VentafacturaDto> obtenerVentas() throws Exception {		
		List<VentafacturaPojo> listaVentaPojo = ventafacturaFacadeImpl.findAll();
		return (List<VentafacturaDto>) ObjectBuilder.converListObject(VentafacturaPojo.class, VentafacturaDto.class,  listaVentaPojo);
	}

}
