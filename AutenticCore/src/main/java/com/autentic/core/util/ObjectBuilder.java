/**
 * 
 */
package com.autentic.core.util;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * @author esalcedo
 *
 */
public class ObjectBuilder {
	/**
	 * 
	 * @param inClass
	 * @param outClass
	 * @param object
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object convertObject(Class inClass,Class outClass,Object object) {
		 MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		 mapperFactory.classMap(inClass,outClass);
		 MapperFacade mapper = mapperFactory.getMapperFacade();
		 return mapper.map(object, outClass);
	}
}
