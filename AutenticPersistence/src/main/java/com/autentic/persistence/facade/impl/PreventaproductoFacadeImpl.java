/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autentic.persistence.dao.PreventaproductoDao;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.entity.Preventaproducto;
import com.autentic.persistence.entity.Producto;
import com.autentic.persistence.facade.PreventaproductoFacade;
import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.PreventaproductoPojo;
import com.autentic.persistence.pojo.ProductoPojo;
import com.autentic.persistence.util.ObjectBuilder;

@Service
public class PreventaproductoFacadeImpl implements PreventaproductoFacade{
	
	@Autowired
	private PreventaproductoDao preventaproductoDao;
	
	@Transactional
	public void create(PreventaproductoPojo object) throws SQLException {
		update(object);
	}
	
	@Transactional
	public void update(PreventaproductoPojo object) throws SQLException {
		Preventaproducto preventaproducto = (Preventaproducto) ObjectBuilder.convertObject(PreventaproductoPojo.class, Preventaproducto.class, object);
		preventaproductoDao.save(preventaproducto);
		object.setId(preventaproducto.getId());
	}

	public PreventaproductoPojo find(Serializable id) throws SQLException {
		return (PreventaproductoPojo) ObjectBuilder.convertObject(Preventaproducto.class, PreventaproductoPojo.class, preventaproductoDao.findOne((Integer) id));
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<PreventaproductoPojo> findAll() throws SQLException {
		Iterable<Preventaproducto> restulDataBase = preventaproductoDao.findAll();
		List<Preventaproducto> finalList = ObjectBuilder.toList(restulDataBase);		  
		return (List<PreventaproductoPojo>) ObjectBuilder.converListObject(Preventaproducto.class, PreventaproductoPojo.class, finalList);

	}	
	
	@Override
	public PreventaproductoPojo findByIdproductoAndIdpreventa(ProductoPojo idproducto, PreventaPojo idpreventa) throws SQLException {
		Producto productoEntity = (Producto) ObjectBuilder.convertObject(ProductoPojo.class, Producto.class,  idproducto);
		Preventa preventaEntity = (Preventa) ObjectBuilder.convertObject(PreventaPojo.class, Preventa.class,  idpreventa);
		
		List<Preventaproducto> preventaproducto = preventaproductoDao.findByIdproductoAndIdpreventa(productoEntity, preventaEntity);
		if (null != preventaproducto && preventaproducto.size() > 0) {
			return (PreventaproductoPojo) ObjectBuilder.convertObject(Preventaproducto.class, PreventaproductoPojo.class, preventaproducto.get(0));
		}
		return null;
	}
}
