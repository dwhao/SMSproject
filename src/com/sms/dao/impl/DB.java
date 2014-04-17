package com.sms.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DB
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

}
