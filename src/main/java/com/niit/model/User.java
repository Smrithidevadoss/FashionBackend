package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="UserDetail")
@Entity
@Component
public class User
{

	@Id
	@Column(name = "username")
	private String name;
	@Column(name = "password")
	private String password;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "Address")
	private String address;

	@Column(name = "customername ")
	private String customername;

	public boolean isEnabled() 
	{
		return enabled;
	}

	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
	}

	@Column(name = "role")
	private String role;

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getCustomername() 
	{
		return customername;
	}

	public void setCustomername(String customername)
	{
		this.customername = customername;
	}

}