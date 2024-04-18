package com.RE.springboot.backend.apirest.models.services;

import java.util.List;

import com.RE.springboot.backend.apirest.models.entity.Instructor;

public interface IInstructorService {

	public List<Instructor> findAll();
	
	public Instructor findById(Long id);
	
	public Instructor save(Instructor instructor);
	
	public void delete(Long id);
}
