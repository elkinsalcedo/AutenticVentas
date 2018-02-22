/**
 * 
 */
package com.autentic.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.autentic.ws.facade.AutenticWsFacade;
import com.autentic.ws.type.CrearVentaRequest;
import com.autentic.ws.type.CrearVentaResponse;

/**
 * @author esalcedo
 *
 */
@Endpoint
public class AutenticEndPoint {
	
	private static final String NAMESPACE_URI = "http://ws.autentic.com/AutenticWS";
	
	@Autowired
	private AutenticWsFacade autenticWsFacadeImpl;
	
	/**
	 * 
	 * @param crearVentaRequest
	 * @return crearVentaResponse
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CrearVentaRequest")
	@ResponsePayload
	public CrearVentaResponse crearVenta(@RequestPayload CrearVentaRequest crearVentaRequest) {
		return autenticWsFacadeImpl.crearVenta(crearVentaRequest);
	}
}
