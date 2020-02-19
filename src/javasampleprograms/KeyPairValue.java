package javasampleprograms;

import java.util.HashMap;
import java.util.Map;

public class KeyPairValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<Integer,String>();
	    map.put(25, "john");
	    if(map.containsValue("john")){
	    	System.out.println("Key is : "+map.get(25));
	    }
	}

}
