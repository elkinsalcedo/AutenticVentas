/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.facade;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import com.autentic.persistence.pojo.PreventaPojo;

public interface PreventaFacade {
	
	/**
	 * @param object
	 * @throws SQLException
	 */
	public void update(PreventaPojo object) throws SQLException;
	
	/**
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public PreventaPojo find(Serializable id) throws SQLException;
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public List<PreventaPojo> findAll() throws SQLException;

}