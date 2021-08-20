package com.ddlab.rnd.tableperhierarchy;

import org.springframework.context.ApplicationContext;

public class TestTablePerConcreteClass {

	public static void storeInfo(ApplicationContext applicationContext) {

		EmployeeService service = applicationContext.getBean(EmployeeService.class);

		Employee employee = new Employee();
		employee.setName("Vidya");

		service.saveInfo(employee);

		PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setName("Jacob");
		permanentEmployee.setSalary(30000);

		service.saveInfo(permanentEmployee);

		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("Raj");
		contractEmployee.setHourlyRate(2000);

		service.saveInfo(contractEmployee);

	}

}
