/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import com.autentic.persistence.pojo.ProductoPojo;

public interface ProductoFacade {
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void update(ProductoPojo object) throws SQLException;
	
	/**
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ProductoPojo find(Serializable id) throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public List<ProductoPojo> findAll() throws SQLException;
}
