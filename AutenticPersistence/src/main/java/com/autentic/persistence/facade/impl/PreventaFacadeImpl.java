/**
 * 
 */
package com.autentic.persistence.facade.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autentic.persistence.dao.PreventaDao;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.facade.PreventaFacade;
import com.autentic.persistence.pojo.PreventaPojo;
import com.autentic.persistence.util.ObjectBuilder;

/**
 * @author esalcedo
 *
 */

@Service
public class PreventaFacadeImpl implements PreventaFacade {
	
	@Autowired
	private PreventaDao preventaDao;
	
	@Transactional
	public void update(PreventaPojo object) throws SQLException {
		Preventa preventa = (Preventa) ObjectBuilder.convertObject(PreventaPojo.class, Preventa.class, object);
		preventaDao.save(preventa);
		object.setId(preventa.getId());
	}

	public PreventaPojo find(Serializable id) throws SQLException {
		return (PreventaPojo) ObjectBuilder.convertObject(Preventa.class, PreventaPojo.class, preventaDao.findOne((Integer) id));
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<PreventaPojo> findAll() throws SQLException {
		Iterable<Preventa> restulDataBase = preventaDao.findAll();
		List<Preventa> finalList = ObjectBuilder.toList(restulDataBase);		  
		return (List<PreventaPojo>) ObjectBuilder.converListObject(Preventa.class, PreventaPojo.class, finalList);
	}

}
