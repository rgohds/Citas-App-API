package com.RE.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.RE.springboot.backend.apirest.models.entity.Instructor;

public interface IInstructorDao extends CrudRepository<Instructor, Long> {
	
	//List<Cliente> findByEmail(String Email);
	

}
