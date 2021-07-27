package com.mycompany.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Employee;

public interface IEmployeeDAO extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByNameAndEmail(String name, String email);
	List<Employee> findByNameLike(String name);
	List<Employee> findByNameStartingWith(String name);
	List<Employee> findByNameContaining(String name);
}
