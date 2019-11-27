package com.spring.serasaclient.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.serasaclient.models.Consumidor;


@RestController
@RequestMapping("/serasa")
public class SerasaController {
	
	@RequestMapping("/{cpf}")
	public List<Consumidor> getConsumidorPorCpf(@PathVariable("cpf") String cpf) {
		return Collections.singletonList(new Consumidor(cpf, true));
	}

}
