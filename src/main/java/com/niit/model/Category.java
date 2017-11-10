package com.niit.model;

public class Category 
{
    int Id;
    public int getId()
    {
	   return Id;
    }
	public void setId(int id) 
	{
		Id = id;
	}
	public String getCategoryName()
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	public String getCategoryDescription()
	{
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription)
	{
		this.categoryDescription = categoryDescription;
	}
	String categoryName;
    String categoryDescription;
         
}