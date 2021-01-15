package com.petzapp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetzController {
	
	@Autowired
	private PetzRepository pr;
	
	
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form(){
		return "petz/formCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Cliente cliente){
		
		/*if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/consultar";
		}*/
		pr.save(cliente);
		//attributes.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso!");
		return "redirect:/cadastrarCliente";
		
		
	}
	
	
	
	@RequestMapping("/clientes")
	public ModelAndView listaClientes(){
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cliente> clientes = pr.findAll();
		mv.addObject("clientes", clientes);
		return mv;
	}

}
