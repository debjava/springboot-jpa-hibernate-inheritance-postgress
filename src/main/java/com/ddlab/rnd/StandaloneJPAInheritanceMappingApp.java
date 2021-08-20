package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.ddlab.rnd.audit.TestAuditCheck;
import com.ddlab.rnd.tableperhierarchy.TestTablePerConcreteClass;

@EnableJpaAuditing
@SpringBootApplication
public class StandaloneJPAInheritanceMappingApp {
	
//	@Bean
//    public AuditorAware<String> auditorAware() {
//        return new AuditorAwareImpl();
//    }

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StandaloneJPAInheritanceMappingApp.class, args);
//		TestTablePerHierarchy.storeInfo(applicationContext);
//		TestTablePerConcreteClass.storeInfo(applicationContext);
//		TestTablePerConcreteClass.storeInfo(applicationContext);
		TestAuditCheck.storeInfo(applicationContext);
		
	}

}
