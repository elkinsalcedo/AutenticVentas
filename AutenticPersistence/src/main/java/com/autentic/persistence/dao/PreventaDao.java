/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.dao;

import org.springframework.data.repository.CrudRepository;
import com.autentic.persistence.entity.Preventa;

public interface PreventaDao extends CrudRepository<Preventa, Integer> {
	
}