package com.ddlab.rnd.tableperhierarchy;

import org.springframework.context.ApplicationContext;

public class TestTablePerHierarchy {
	
	public static void storeInfo(ApplicationContext applicationContext) {
		
		EmployeeService service = applicationContext.getBean(EmployeeService.class);
		
		Employee employee=new Employee();  
        employee.setName("John");
        
        service.saveInfo(employee);
        
        PermanentEmployee permanentEmployee=new PermanentEmployee();  
        permanentEmployee.setName("Jacob");  
        permanentEmployee.setSalary(30000);  
        
        service.saveInfo(permanentEmployee);
        
        ContractEmployee contractEmployee=new ContractEmployee();  
        contractEmployee.setName("Raj");  
        contractEmployee.setHourlyRate(2000);  
        
        service.saveInfo(contractEmployee);
        
		
	}

}
