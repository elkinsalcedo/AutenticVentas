package com.autentic.ws.facade.impl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autentic.core.dto.CrearVentaRequestDto;
import com.autentic.core.dto.CrearVentaResponseDto;
import com.autentic.core.facade.AutenticCoreFacade;
import com.autentic.ws.facade.AutenticWsFacade;
import com.autentic.ws.type.CrearVentaRequest;
import com.autentic.ws.type.CrearVentaResponse;
import com.autentic.ws.type.ResultadoOperacionType;
import com.autentic.ws.util.BuilderDto;

@Component
public class AutenticWsFacadeImpl implements AutenticWsFacade{

	@Autowired
	private BuilderDto builderDtoImpl;
	
	@Autowired
	private AutenticCoreFacade AutenticCoreFacadeImpl;
	
	@Override
	public CrearVentaResponse crearVenta(CrearVentaRequest crearVentaRequest) {
		CrearVentaRequestDto crearVentaRequestDto = builderDtoImpl.convertirCrearVentaRequestTypeADto(crearVentaRequest);
		try {
			CrearVentaResponseDto crearVentaResponseDto = AutenticCoreFacadeImpl.crearVenta(crearVentaRequestDto);
			return builderDtoImpl.convertirCrearVentaResponseDtoAType(crearVentaResponseDto);
		}catch (Exception e) {
			CrearVentaResponse crearVentaResponse = new CrearVentaResponse();
			ResultadoOperacionType resultadoOperacionType = new ResultadoOperacionType();
			resultadoOperacionType.setCodigo(BigInteger.valueOf(401));
			resultadoOperacionType.setMensaje("Lo sentimos, ha ocurrido un error al momento de crear la venta. " + e.getMessage());
			crearVentaResponse.setResultadoOperacion(resultadoOperacionType);
			return crearVentaResponse;
		}	
	}

}
