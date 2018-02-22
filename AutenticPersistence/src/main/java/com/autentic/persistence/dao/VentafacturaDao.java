/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.entity.Ventafactura;

/**
 *
 * @author esalcedo
 */
public interface VentafacturaDao extends CrudRepository<Ventafactura, Integer> {

	public List<Ventafactura> findByIdpreventa( Preventa idpreventa) throws SQLException;
}

