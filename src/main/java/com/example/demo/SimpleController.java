package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SimpleController {
	
	@GetMapping( path = "/teste", produces = "application/json")
	public Map<String,String> teste() {
		
		Map<String,String> retorno = new HashMap<String,String> ();
		retorno.put("status", "OK");
		
		log.info("Acessado com sucesso! {}",retorno);
		
		return retorno;
    }

}
