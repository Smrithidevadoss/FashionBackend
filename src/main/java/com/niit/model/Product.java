package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@SuppressWarnings("unused")
@Entity
@Component
public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int productId;
	int price;
	int quantity;
	String productname;
	String description; 

	@GeneratedValue(strategy=GenerationType.AUTO)
	String category_Id;
	public String getCategory_Id() 
	{
		return category_Id;
	}
	public void setCategory_Id(String category_Id) 
	{
		this.category_Id = category_Id;
	}
	public String getSupplier_Id()
	{
		return getSupplier_Id();
	}
	public void setSupplier_Id(String supplier_Id) 
	{
		this.supplier_Id = supplier_Id;
	}

	@GeneratedValue(strategy=GenerationType.AUTO)
	String supplier_Id;
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public String getProductname() 
	{
		return productname;
	}
	public void setProductname(String productname) 
	{
		this.productname = productname;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public Object getCode()
	{
		return null;
	}
	
}