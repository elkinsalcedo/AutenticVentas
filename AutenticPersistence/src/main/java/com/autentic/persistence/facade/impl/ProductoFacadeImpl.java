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
import com.autentic.persistence.dao.ProductoDao;
import com.autentic.persistence.entity.Producto;
import com.autentic.persistence.facade.ProductoFacade;
import com.autentic.persistence.pojo.ProductoPojo;
import com.autentic.persistence.util.ObjectBuilder;

/**
*
* @author esalcedo
*/

@Service
public class ProductoFacadeImpl implements ProductoFacade {
	
	@Autowired
	private ProductoDao productoDao;
	
	@Transactional
	public void update(ProductoPojo object) throws SQLException {
		Producto producto = (Producto) ObjectBuilder.convertObject(ProductoPojo.class, Producto.class, object);
		productoDao.save(producto);
		object.setId(producto.getId());
		
	}

	public ProductoPojo find(Serializable id) throws SQLException {
		return (ProductoPojo) ObjectBuilder.convertObject(Producto.class, ProductoPojo.class, productoDao.findOne((Integer) id));
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<ProductoPojo> findAll() throws SQLException {
		Iterable<Producto> restulDataBase = productoDao.findAll();
		List<Producto> finalList = ObjectBuilder.toList(restulDataBase);		  
		return (List<ProductoPojo>) ObjectBuilder.converListObject(Producto.class, ProductoPojo.class, finalList);
	}
	
}
