package com.ddlab.rnd.tableperhierarchy;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee2")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited
public class Employee {
	
	@Id
    @GeneratedValue
    private int id;
 
    private String name;

}
