package com.flipkart.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonData {
	public static Properties p;
	public static String url;
	static
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./data/flipkart.property");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    p=new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String url() throws IOException
	{
		
		
		 url = p.getProperty("url");
		 return url;
	}
	public static String username()
	{
		 String username = p.getProperty("usename");
		 return username;
	}
	public static String password()
	{
		 String pwd = p.getProperty("password");
		 return pwd;
	}
	}
	



