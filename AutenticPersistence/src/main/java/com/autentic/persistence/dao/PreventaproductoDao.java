/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.dao;

import java.sql.SQLException;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.autentic.persistence.entity.Preventa;
import com.autentic.persistence.entity.Preventaproducto;
import com.autentic.persistence.entity.Producto;

public interface PreventaproductoDao extends CrudRepository<Preventaproducto, Integer> {
	
	public List<Preventaproducto> findByIdproductoAndIdpreventa( Producto idproducto, Preventa idpreventa) throws SQLException;

}
