package interviewPrep;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatValidation {
   public static void main(String[] args) {
	dateFormat();
}
   
   public static void dateFormat(){
	   String format="yyyy-MM-dd HH:mm:ss";
	   SimpleDateFormat form=new SimpleDateFormat(format);
	   form.setTimeZone(TimeZone.getTimeZone("AST"));
	   form.setLenient(false);
	   Date dateF=new Date("2019/06/18 10:02:02");
	   Date dateF1=new Date(2016, 8, 25);
	   String date="2019-06-30 2:58:02";
	   String date1="2019-08-20 00:00:25";
	   try{
		   Date d=form.parse(date);
		   String dF=form.format(dateF);
		   System.out.println("date with format : "+ dF);
		   System.out.println("date is "+d);
	   }catch(Exception e){
		   System.out.println(e.getMessage());
		   System.out.println("date format is not valid");
	   }
	   
	   try{
		   String dF1=form.format(dateF1);
		   System.out.println("date with format 2: "+ dF1);
		   Date d1=form.parse(date1);
		   System.out.println("date is "+d1.toString());
	   }catch(Exception e){
		   System.out.println(e.getMessage());
		   System.out.println("date format is not valid 2");
	   }
   }
}
