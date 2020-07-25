package com.juri.printing.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class GenerateUtil {

	public static Date Cur_Date = new Date();	
	public static Date Tom_Date = null;
	public static Long IncreaseNum = 00L;
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {		
		Calendar c = Calendar.getInstance(); 
		c.setTime(Cur_Date);		
		c.add(Calendar.DATE, -1);
		Cur_Date = c.getTime();
		c.add(Calendar.DATE, 1);
		Tom_Date = c.getTime();	
		genrate();
		System.out.println(Cur_Date);
		System.out.println(Tom_Date);
		System.out.println(IncreaseNum);
	}
	static String genrate(){
		Date curDate = new Date();
		checkDate(curDate);
		return null;
	}
	static boolean checkDate(Date curDate) {
		if(sdf.format(Cur_Date).equals(sdf.format(curDate))) {
			IncreaseNum++;
			System.out.println("current date");
			return true;
		}else if(sdf.format(curDate).equals(sdf.format(Tom_Date))) {
			System.out.println("tomorrow date");
			IncreaseNum = 01L;
			Cur_Date = curDate;
			Calendar c = Calendar.getInstance(); 
			c.setTime(Cur_Date); 
			c.add(Calendar.DATE, 1);
			Tom_Date = c.getTime();
		}
		return true;
	}
}
