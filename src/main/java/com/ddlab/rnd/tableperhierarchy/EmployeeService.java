package com.ddlab.rnd.tableperhierarchy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public void saveInfo(Employee emp) {
		repo.save(emp);
	}

}
