package com.pritamraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message="Name is required")
	@Size(min = 5,max = 10,message="Name Size Should be min 5 and max 10")
	private String name;
	
	@NotNull(message="Price is required")
	@Positive(message="Price should Positive")
	private Double price;
	
	private String category;
	
	@NotNull(message="Qty is required")
	@Positive(message="Qty should positive")
	private Integer qty;
		

}
