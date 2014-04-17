package com.sms.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import com.sms.dao.DB_con;

public class DB implements DB_con
{

	public DB()
	{
		// TODO Auto-generated constructor stub
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("DBConfig.properties");   
		  Properties p = new Properties();   
		  try {   
		   p.load(inputStream);   
		  } catch (IOException e1) {   
		   e1.printStackTrace();   
		  }   
		System.out.println("ip:"+p.getProperty("ip")+",port:"+p.getProperty("port"));  
	}

	@Override
	public Connection openConnection()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setURL(String url)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getURL()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
