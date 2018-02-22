/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autentic.persistence.dao.VentafacturaDao;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.entity.Preventaproducto;
import com.autentic.persistence.entity.Ventafactura;
import com.autentic.persistence.facade.VentafacturaFacade;
import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.PreventaproductoPojo;
import com.autentic.persistence.pojo.VentafacturaPojo;
import com.autentic.persistence.util.ObjectBuilder;

/**
 *
 * @author esalcedo
 */
@Service
public class VentafacturaFacadeImpl implements VentafacturaFacade{
	
	@Autowired
	private VentafacturaDao ventafacturaDao;
	
	@Transactional
	public void create(VentafacturaPojo object) throws SQLException {
		update(object);
	}
	
	@Transactional
	public void update(VentafacturaPojo object) throws SQLException {
		Ventafactura ventafactura = (Ventafactura) ObjectBuilder.convertObject(VentafacturaPojo.class, Ventafactura.class, object);
		ventafacturaDao.save(ventafactura);
		object.setId(ventafactura.getId());
		
	}

	public VentafacturaPojo find(Serializable id) throws SQLException {
		return (VentafacturaPojo) ObjectBuilder.convertObject(Ventafactura.class, VentafacturaPojo.class, ventafacturaDao.findOne((Integer) id));
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<VentafacturaPojo> findAll() throws SQLException {
		Iterable<Ventafactura> restulDataBase = ventafacturaDao.findAll();
		List<Ventafactura> finalList = ObjectBuilder.toList(restulDataBase);		  
		return (List<VentafacturaPojo>) ObjectBuilder.converListObject(Ventafactura.class, VentafacturaPojo.class, finalList);
	}
	
	@Override
	public VentafacturaPojo findByIdpreventa(PreventaPojo idpreventa) throws SQLException {
		Preventa preventaEntity = (Preventa) ObjectBuilder.convertObject(PreventaPojo.class, Preventa.class,  idpreventa);		
		List<Ventafactura> ventafactura = ventafacturaDao.findByIdpreventa( preventaEntity);
		
		if (null != ventafactura && ventafactura.size() > 0) {
			return (VentafacturaPojo) ObjectBuilder.convertObject(Ventafactura.class, VentafacturaPojo.class, ventafactura.get(0));
		}
		return null;
	}
	
}

