package com.organic.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vegetable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vegId;
	private String name;
	private String type;
	private Double price;
	private Integer quantity;

	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cart cart;
		
}