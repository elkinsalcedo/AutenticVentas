package com.autentic.core.facade;

import java.util.ArrayList;
import java.util.List;

import com.autentic.core.dto.CrearVentaRequestDto;
import com.autentic.core.dto.CrearVentaResponseDto;
import com.autentic.core.dto.VentafacturaDto;

public interface AutenticCoreFacade {
	
	public CrearVentaResponseDto crearVenta(CrearVentaRequestDto crearVentaRequestDto) throws Exception;
	public List<VentafacturaDto> obtenerVentas()  throws Exception;
}
