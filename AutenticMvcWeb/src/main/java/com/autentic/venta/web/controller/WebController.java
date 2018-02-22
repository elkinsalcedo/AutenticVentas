/**
 * 
 */
package com.autentic.venta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author esalcedo
 *
 */
@Controller
public class WebController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }
	
	@RequestMapping(value="/ventas",method = RequestMethod.GET)
    public String listaventas(){
        return "ventas";
    }
	
}
