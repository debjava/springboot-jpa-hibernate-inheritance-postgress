package com.ddlab.rnd.audit;

import org.springframework.context.ApplicationContext;

public class TestAuditCheck {

public static void storeInfo(ApplicationContext applicationContext) {
		
		AuditService service = applicationContext.getBean(AuditService.class);
		
		Blog blog = new Blog();
		blog.setName("My New Blog");
		blog.setSize(20);
		blog.setTitle("Java programming");
		blog.setVersion(1);
        
        service.saveInfo(blog);
        
		
	}
}
