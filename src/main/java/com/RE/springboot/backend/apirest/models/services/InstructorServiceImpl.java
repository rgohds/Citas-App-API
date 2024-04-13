package com.RE.springboot.backend.apirest.models.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RE.springboot.backend.apirest.models.dao.IClienteDao;
import com.RE.springboot.backend.apirest.models.dao.IInstructorDao;
import com.RE.springboot.backend.apirest.models.entity.Cliente;
import com.RE.springboot.backend.apirest.models.entity.Instructor;

@Service
public class InstructorServiceImpl implements IInstructorService {

	@Autowired
	private IInstructorDao InstructorDao;
	
	@Override	
	public List<Instructor> findAll() {
		return (List<Instructor>) InstructorDao.findAll();
				
	}
		
}
