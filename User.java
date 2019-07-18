package voting;
import java.util.*;
public class User {
 static HashMap<String,Integer> hm=new HashMap<>();
	static 	public int votes(String s){
		return hm.get(s);
	}
	static public void vote(String s){
		int h=(votes(s))+1;
		hm.put(s,h);
	}
	@Override
	public String toString() {
		return "User [hm=" + hm + "]";
	}
	
    
}
