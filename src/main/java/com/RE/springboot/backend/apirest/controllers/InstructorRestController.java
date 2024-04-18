package com.RE.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping("/instructores/{id}")	
	public Instructor show(@PathVariable Long id) {
		return InstructorService.findById(id);
	}	
	
	@PostMapping("/instructores")
	@ResponseStatus(HttpStatus.CREATED)
	public Instructor create(@RequestBody Instructor instructor ) {		
		return InstructorService.save(instructor);
	}
	
	@PutMapping("/instructores/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Instructor update(@RequestBody Instructor instructor, @PathVariable Long id) {
		Instructor instructorActual = InstructorService.findById(id);
		
		instructorActual.setNombre(instructor.getNombre());
		instructorActual.setApellido(instructor.getApellido());

		return InstructorService.save(instructorActual);
	}
	
	@DeleteMapping("/instructores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {		
		InstructorService.delete(id);
	}
}

