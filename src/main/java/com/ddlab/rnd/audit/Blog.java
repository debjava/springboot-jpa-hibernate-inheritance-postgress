package com.ddlab.rnd.audit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import lombok.Data;

@Data
@Entity
@Table(name = "blog")
@Audited
public class Blog {

	@Id
	@GeneratedValue
	private Long id;
	
	@Audited
	private String name;
	
	@Audited
	private String title;
	
	@Audited
	private int version;
	
	@NotAudited
	private int size;
	
}
