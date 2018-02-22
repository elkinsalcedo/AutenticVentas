/**
 * 
 */
package com.autentic.core.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.autentic.core.conf.AutenticCoreConf;
import com.autentic.core.dto.VentafacturaDto;
import com.autentic.core.facade.AutenticCoreFacade;
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
@ContextConfiguration(classes = AutenticCoreConf.class)
public class AutenticCoreTest {

	
	@Autowired
	private AutenticCoreFacade autenticCoreFacadeImpl;
	
	
	@Test
	public void obtenerListaVenta() {
		try {
			List<VentafacturaDto> listaVenta = autenticCoreFacadeImpl.obtenerVentas();
			System.out.println("" + listaVenta.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
