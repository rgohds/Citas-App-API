package com.RE.springboot.backend.apirest.models.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RE.springboot.backend.apirest.models.dao.IClienteDao;
import com.RE.springboot.backend.apirest.models.dao.IInstructorDao;
import com.RE.springboot.backend.apirest.models.entity.Cliente;
import com.RE.springboot.backend.apirest.models.entity.Instructor;


@Service
public class InstructorServiceImpl implements IInstructorService {

	@Autowired
	private IInstructorDao InstructorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Instructor> findAll() {
		return (List<Instructor>) InstructorDao.findAll();
				
	}

	@Override
	@Transactional(readOnly = true)
	public Instructor findById(Long id) {
		// TODO Auto-generated method stub
		return InstructorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public Instructor save(Instructor instructor) {
		// TODO Auto-generated method stub
		return InstructorDao.save(instructor);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		// TODO Auto-generated method stub
		InstructorDao.deleteById(id);
		
	}
		
}
