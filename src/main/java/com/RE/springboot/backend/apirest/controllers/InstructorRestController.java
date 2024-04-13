package com.RE.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RE.springboot.backend.apirest.models.entity.Cliente;
import com.RE.springboot.backend.apirest.models.entity.Instructor;
import com.RE.springboot.backend.apirest.models.services.IClienteService;
import com.RE.springboot.backend.apirest.models.services.IInstructorService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class InstructorRestController {

	@Autowired
	private IInstructorService InstructorService;
	
	@GetMapping("/instructores")
	public List<Instructor> index() {
		return InstructorService.findAll();
		
	}
	
}

