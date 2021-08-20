package com.ddlab.rnd.audit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepo extends JpaRepository<Blog, Long> {

}
