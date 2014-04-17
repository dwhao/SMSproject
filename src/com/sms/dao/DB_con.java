package com.sms.dao;
import java.sql.Connection;
import java.util.Properties;

public interface DB_con
{
	String url = "";
	
	public Connection openConnection();
	public void setURL(String url);
	public String getURL();
}
