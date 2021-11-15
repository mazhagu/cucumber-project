package com.helper;

public class FileRedaerManager {
	
	
	private FileRedaerManager (){
	}
		
	public FileRedaerManager getInstanceFR() {
		FileRedaerManager fr=new FileRedaerManager();
        return fr;
	}
		
	public  static ConfigerationReader getInstanceCR() throws Throwable {
		ConfigerationReader cr=new ConfigerationReader();
		return cr;
	}

		
	
}
