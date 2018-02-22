package com.autentic.ws.facade;

import com.autentic.ws.type.CrearVentaRequest;
import com.autentic.ws.type.CrearVentaResponse;

public interface AutenticWsFacade {
	public CrearVentaResponse crearVenta(CrearVentaRequest crearVentaRequest);
}
