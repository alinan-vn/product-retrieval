package com.hcl.productcreator.store;

import javax.persistence.*;

@Table(name = "my_product")
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	@Column(name = "name")
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Column(name = "type")
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Column(name ="price")
	private Long price;
	
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Long getPrice() {
		return price;
	}
	
}
