package com.ddlab.rnd.tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PermanentEmployee")
@PrimaryKeyJoinColumn(name="Id")
public class PermanentEmployee extends Employee {

	@Column(name = "salary")
    private double salary;
}
