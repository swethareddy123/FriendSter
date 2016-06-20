package com.bvrit.friendster.controller;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Friendsterlog {
	
	protected static String logFile = "/home/pearl-29/log.txt";
	private static org.apache.log4j.Logger log = Logger.getLogger(Friendsterlog.class);
	private static Object appender;
	//private Logger logger = null;
	
	public void init() {
		log = Logger.getRootLogger();
		BasicConfigurator.configure();
		
	}
		 public static void write(String user) throws IOException {
	         write(logFile, user);
	     }
	    
	    public static void write(String logFile, String user) throws IOException {
	         TimeZone tZone = TimeZone.getTimeZone("EST"); // or PST, MID, etc ...
	         Date date = new Date();
	         DateFormat dFormat = new SimpleDateFormat("yyyy.mm.dd,hh:mm:ss");
	         dFormat.setTimeZone(tZone);
	         String currentTime = dFormat.format(date);
	         
	         FileWriter fWriter = new FileWriter(logFile, true);
	         fWriter.write(user + "logged in at " + currentTime + "\n");
	         
	         //AddressBookLog.appender.DatePattern='yyyy-MM-dd';
	         fWriter.flush();
	         fWriter.close();
	     }
}