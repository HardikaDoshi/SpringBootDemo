package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.IEmployeeDAO;
import com.mycompany.entity.Employee;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	public void addEmployee(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public Employee getEmployee(int id) {
		return employeeDAO.findById(id).get();
	}
	
	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public void removeEmployee(int id) {
		employeeDAO.deleteById(id);	
	}
	
	public List<Employee> findByNameAndEmail(String name, String email){
		return employeeDAO.findByNameAndEmail(name, email);
	}
	
	public  List<Employee> findByNameContaining(String word) {
		return employeeDAO.findByNameContaining(word);	
	}

	public void deleteEmployee(int id) {
		employeeDAO.deleteById(id);
	}
}
