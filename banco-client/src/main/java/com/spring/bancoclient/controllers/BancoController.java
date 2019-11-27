package com.spring.bancoclient.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bancoclient.models.Conta;

@RestController
@RequestMapping("/banco")
public class BancoController {

	@RequestMapping("/conta")
	public List<Conta> getContas() {
		return Collections.singletonList(new Conta(4444, 23232323, "111.222.333-44"));
	}
}
