package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@Column(name="sfee")
	private Double stdFee;
	
	@Column(name="scourse")
	private String stdCourse;
	
	@Column(name="sfeedisc")
	private Double stdFeeDisc;
	
	@Column(name="sfeegst")
	private Double stdFeeGst;
}
