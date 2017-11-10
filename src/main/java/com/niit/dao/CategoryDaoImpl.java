package com.niit.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;
import com.niit.model.Product;
@SuppressWarnings("unused")
@Repository
public class CategoryDaoImpl implements CategoryDao 
{
@Autowired
private SessionFactory sessionFactory;
public CategoryDaoImpl(SessionFactory sessionFactory)
{
		this.sessionFactory=sessionFactory;
	}
/*@Transactional
	public boolean saveCategory(Category category) 
	{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}*/

public boolean saveCategory(Category category) 
	{
	Session session=sessionFactory.openSession();
	session.saveOrUpdate(category);
	org.hibernate.Transaction tx=session.beginTransaction();
	tx.commit();
	return true;
	}

}