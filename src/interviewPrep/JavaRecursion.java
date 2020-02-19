package interviewPrep;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JavaRecursion {
static int n1=0,n2=1,n3=0;
	public static void main(String[] args) throws MalformedURLException, JSONException {
		//int count=15;
		//System.out.print(n1+" "+n2);
		//fabinoci(count-2);
		System.out.println(factorial(5));
		URL url=new URL("https://api.spotify.com/v1");
		RestAssured.baseURI="https://api.spotify.com/v1";
		RequestSpecification req=RestAssured.given();
		Response response=req.request(Method.GET,"/albums");
		String responseBody=response.body().asString();
		System.out.println(responseBody);
		//JSONArray jarr=new JSONArray(responseBody);
		//String title=jarr.getJSONObject(0).get("title").toString();
		//System.out.println(title);
		
		
	}

	public static void fabinoci(int count){
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
           fabinoci(count-1);
		}
	}
	
	public static int factorial(int num){
		if(num==1){
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
}
