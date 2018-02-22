/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.pojo.VentafacturaPojo;

/**
 *
 * @author esalcedo
 */
public interface VentafacturaFacade{
	
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void create( VentafacturaPojo object) throws SQLException;
	
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void update( VentafacturaPojo object) throws SQLException;
	
	/**
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public VentafacturaPojo find(Serializable id) throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public List<VentafacturaPojo> findAll() throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public VentafacturaPojo findByIdpreventa(PreventaPojo idpreventa) throws SQLException;
}

