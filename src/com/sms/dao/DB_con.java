package com.sms.dao;
import java.sql.Connection;
import java.util.Properties;

public interface DB_con
{
	String url = "";
	
	public Connection openConnection();//打开数据库连接
	public void setURL(String url); 
	public String getURL();
}
