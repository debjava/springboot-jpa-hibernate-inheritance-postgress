package com.ddlab.rnd.tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ContractEmployee")
@PrimaryKeyJoinColumn(name="Id")
public class ContractEmployee extends Employee {
   
    @Column(name = "hourlyRate")
    private double hourlyRate;
 
 
}