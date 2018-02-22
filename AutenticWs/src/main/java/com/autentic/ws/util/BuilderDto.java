/**
 * 
 */
package com.autentic.ws.util;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.autentic.core.dto.CrearVentaRequestDto;
import com.autentic.core.dto.CrearVentaResponseDto;
import com.autentic.core.util.ObjectBuilder;
import com.autentic.ws.type.CrearVentaRequest;
import com.autentic.ws.type.CrearVentaResponse;

/**
 * @author esalcedo
 *
 */
@Component
public class BuilderDto implements Serializable{

	private static final long serialVersionUID = 1L;

	public BuilderDto() {
		
	}
	
	/**
	 * 
	 * @param CrearVentaRequestType
	 * @return CrearVentaRequestDto
	 */
	public CrearVentaRequestDto convertirCrearVentaRequestTypeADto(CrearVentaRequest crearVentaRequestType) {
		return (CrearVentaRequestDto) ObjectBuilder.convertObject(CrearVentaRequest.class, CrearVentaRequestDto.class, crearVentaRequestType);
	}
	
	/**
	 * 
	 * @param CrearVentaResponseDto
	 * @return CrearVentaResponseType
	 */
	public CrearVentaResponse convertirCrearVentaResponseDtoAType(CrearVentaResponseDto crearVentaResponseDto) {
		return (CrearVentaResponse) ObjectBuilder.convertObject(CrearVentaResponseDto.class, CrearVentaResponse.class, crearVentaResponseDto);
	}
}
