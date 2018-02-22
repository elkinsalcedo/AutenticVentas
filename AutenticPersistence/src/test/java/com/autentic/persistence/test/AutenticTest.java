/**
 * 
 */
package com.autentic.persistence.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.autentic.persistence.conf.PersistenceConf;
import com.autentic.persistence.facade.PreventaFacade;
import com.autentic.persistence.facade.PreventaproductoFacade;
import com.autentic.persistence.facade.ProductoFacade;
import com.autentic.persistence.facade.VentafacturaFacade;
import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.PreventaproductoPojo;
import com.autentic.persistence.pojo.ProductoPojo;
import com.autentic.persistence.pojo.VentafacturaPojo;

/**
 * @author esalcedo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConf.class)
public class AutenticTest {

	@Autowired
	private PreventaproductoFacade preventaproductoFacadeImpl;
	
	@Autowired
	private VentafacturaFacade ventafacturaFacadeImpl;
	
	@Autowired
	private ProductoFacade productoFacadeImpl;
	
	@Autowired
	private PreventaFacade PreventaFacadeImpl;
	
	
	@Test
	public void agregarProductoToPreventa() {
		try {
			
			int cantidadProducto = 1;
			PreventaproductoPojo preventaproductoPojo = new PreventaproductoPojo();

			PreventaPojo preventaPojo = new PreventaPojo();
			preventaPojo.setId(2);

			ProductoPojo productoPojo = new ProductoPojo();
			productoPojo.setId(1);

			preventaproductoPojo.setIdpreventa(preventaPojo);
			preventaproductoPojo.setIdproducto(productoPojo);
			preventaproductoPojo.setCantidad(cantidadProducto);
			
			double valorUnitarioProducto = 0;
			ProductoPojo ResultadoProducto = productoFacadeImpl.find(productoPojo.getId());
			if (null != ResultadoProducto) {
				valorUnitarioProducto = ResultadoProducto.getValor();
			}else {
				System.out.println("Producto no encontrado !!!");
			}
			
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
			if (null == ventafacturaPojo) {
				VentafacturaPojo ventafactura = new VentafacturaPojo();
				ventafactura.setIdpreventa(PreventaFacadeImpl.find(preventaPojo.getId()));
				ventafactura.setValortotal(valorProductoCantidad);
				ventafacturaFacadeImpl.create(ventafactura);
			}else {
				ventafacturaPojo.setValortotal(ventafacturaPojo.getValortotal() + valorProductoCantidad);
				ventafacturaFacadeImpl.update(ventafacturaPojo);
			}		
			
			ventafacturaFacadeImpl.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
