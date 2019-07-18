package voting;
import java.util.*;
public class City {
	String s;
ArrayList<Candidates> cand=new ArrayList<>();
public City(String si){
	this.s=si;
}
public String getCity(){
	return s;
}
@Override
public String toString() {
	return "City [cand=" + cand + "]";
}


}

