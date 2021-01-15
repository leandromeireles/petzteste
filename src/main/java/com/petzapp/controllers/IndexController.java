package com.petzapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petzapp.models.Cliente;
import com.petzapp.repository.PetzRepository;

@Controller
public class IndexController {
	
	@Autowired
	private PetzRepository pr;
	
	@RequestMapping("/")
	public ModelAndView listaClientes(){
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cliente> clientes = pr.findAll();
		mv.addObject("clientes", clientes);
		return mv;
	}
	
	
}
