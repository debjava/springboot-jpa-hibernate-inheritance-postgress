package com.ddlab.rnd.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditService {
	
	@Autowired
	private AuditRepo repo;
	
	public void saveInfo(Blog blog) {
		repo.save(blog);
	}
}
