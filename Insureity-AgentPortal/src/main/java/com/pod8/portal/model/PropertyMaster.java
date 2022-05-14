package com.pod8.portal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "PROPERTY_MASTER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long min;
	private long max;
	private int propertyValue;

}
