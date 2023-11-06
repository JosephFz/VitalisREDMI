package com.vita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vita.services.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteService serPaciente;
	
	@RequestMapping("/lista")
	public String index(Model model) {
		model.addAttribute("listaMedicamentos",serPaciente.listarTodos());
		return "medicamento";
	}
	
}
