package com.autentic.venta.web.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autentic.core.dto.PreventaDto;
import com.autentic.core.dto.PreventaproductoDto;
import com.autentic.core.dto.ProductoDto;
import com.autentic.core.dto.VentafacturaDto;
import com.autentic.core.facade.AutenticCoreFacade;

@RestController
public class RestWebController {
	@Autowired
	private AutenticCoreFacade autenticCoreFacadeImpl;
	
	@RequestMapping(value = "/listaventas", method = RequestMethod.GET)
    public List<VentafacturaDto> listaVenta() throws Exception {
		List<VentafacturaDto> listaVentas = autenticCoreFacadeImpl.obtenerVentas();
		List<VentafacturaDto> resultado = new ArrayList<VentafacturaDto>();
		
		Iterator<VentafacturaDto> it = listaVentas.iterator();
		while (it.hasNext()) {
			VentafacturaDto ventafacturaDto = it.next();
			VentafacturaDto ventafactura = new VentafacturaDto();
			ventafactura.setId(ventafacturaDto.getId());
			ventafactura.setValortotal(ventafacturaDto.getValortotal());
			PreventaDto preventaDto = new PreventaDto();
			preventaDto.setComercial(ventafacturaDto.getIdpreventa().getComercial());
			preventaDto.setLugardespacho(ventafacturaDto.getIdpreventa().getLugardespacho());
			preventaDto.setId(ventafacturaDto.getIdpreventa().getId());
			List<PreventaproductoDto> lstProductos = new ArrayList<PreventaproductoDto>();
			Iterator<PreventaproductoDto> itPreventaProducto = ventafacturaDto.getIdpreventa().getPreventaproducto().iterator();
			while (itPreventaProducto.hasNext()) {
				PreventaproductoDto preventaProductoI = itPreventaProducto.next();
				PreventaproductoDto preventaproductoDto = new PreventaproductoDto();
				preventaproductoDto.setCantidad(preventaProductoI.getCantidad());
				ProductoDto producto = new ProductoDto();
				producto.setId(preventaProductoI.getIdproducto().getId());
				producto.setNombre(preventaProductoI.getIdproducto().getNombre());
				producto.setValor(preventaProductoI.getIdproducto().getValor());
				preventaproductoDto.setIdproducto(producto);
				lstProductos.add(preventaproductoDto);
			}
			
			preventaDto.setPreventaproducto(lstProductos);
			ventafactura.setIdpreventa(preventaDto);
			resultado.add(ventafactura);
		}
        return resultado; //
    }
}
