/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.PreventaproductoPojo;
import com.autentic.persistence.pojo.ProductoPojo;

public interface PreventaproductoFacade{
	
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void create(PreventaproductoPojo object) throws SQLException;
	
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void update(PreventaproductoPojo object) throws SQLException;
	
	/**
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public PreventaproductoPojo find(Serializable id) throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public List<PreventaproductoPojo> findAll() throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public PreventaproductoPojo findByIdproductoAndIdpreventa(ProductoPojo idproducto, PreventaPojo idpreventa) throws SQLException;
}
