/**
 * 
 */
package com.autentic.core.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.autentic.persistence.conf.PersistenceConf;

/**
 * @author esalcedo
 *
 */

@Configuration
@Import({ PersistenceConf.class})
@ComponentScan(basePackages = { "com.autentic.core.facade.impl"})
public class AutenticCoreConf {

}
