package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigerationReader {
	public static Properties p;
	
	public ConfigerationReader() throws Throwable {
		
		File f=new File("C:\\Users\\AZHAGURAJ\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\properties\\TestData.properties");
		
		FileInputStream fis= new FileInputStream(f);
		 p=new Properties();
		p.load(fis);
	}

	public String geturl() {
		String url1 = p.getProperty("url");
	return url1;
	}
	public String getusername() {
		 String username = p.getProperty("username");
	    return username;
	}
	public String getpassword() {
		String password=p.getProperty("password");
		return password;
			}
	public String getaddress() {
		String address=p.getProperty("address");
		return address;
	}
	
	public String getcardno() {
		String cardno=p.getProperty("cardno");
		return cardno;
	}
	public String getcvv() {
		String cvv=p.getProperty("cvv");
		return cvv;
	}
	
	
	
}
