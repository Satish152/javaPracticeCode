package interviewPrep;

import javasampleprograms.*;

public class Calc {

	String test;
	static String var; //heap memory - class memory, methods,objects,variables+variablesdata
	String var1;   //stack memory - variables data store,refere - instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String value="Lyber - $42.56";
          var="test";
          Calc obj=new Calc();
          System.out.println(obj.var1);
          System.out.println(var);
          obj.test();
          System.out.println(obj.test1());
	}
	
	public void test(){
	    System.out.println(var);
	}
	
	public String test1(){
		return var;
	}
}
