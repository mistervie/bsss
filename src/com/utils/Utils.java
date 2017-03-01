package com.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {
	public String dateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		return sdf.format(date);  
	}
	
	public Date stringToDate(String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		return new Date(sdf.parse(date).getTime());
	}
}
