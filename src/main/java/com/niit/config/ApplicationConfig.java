package com.niit.config;

import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class ApplicationConfig 
{
	public static Logger logger = Logger.getLogger("Applicationconfig");
	@Bean(name = "myDataSource")
	public DataSource getDataSource() 
	{
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/");
		dataSource.setUsername("ecomm");
		dataSource.setPassword("ecomm");

		return dataSource;
	}
	private Properties getHibernateProperties() 
	{
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean  getSessionFactory(DataSource dataSource) 
	{
		LocalSessionFactoryBean sessionBuilder = new LocalSessionFactoryBean();
		sessionBuilder.setDataSource(getDataSource());
		sessionBuilder.setHibernateProperties(getHibernateProperties());
	
		return sessionBuilder;
	}
	

	@SuppressWarnings("deprecation")
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		return transactionManager;
	}

}