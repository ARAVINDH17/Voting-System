package voting;
import java.util.*;
public class Voting {
static ArrayList<City> city=new ArrayList<>();
static ArrayList <Integer> aadharno=new ArrayList<>();
static Scanner sc=new Scanner(System.in);
static City cty=null;
static String s;
static Candidates candidate=null;
static User u=null;
static boolean authentication=false;
static int p=0;
static public void admin(){
	while(true){
	System.out.println("1.Enter the City");
	System.out.println("2.Enter the city and the candidates");
	int id=sc.nextInt();
	if(id==1){
		String cityname=sc.next();
		cty=new City(cityname);
		city.add(cty);
	}
	else if(id==2){
		String cityname=sc.next();
		for(int i=0;i<city.size();i++){
			cty=city.get(i);
			if(cityname.equals(cty.getCity())){
				authentication=true;
				break;
			}
		}
		if(authentication){
			s=sc.next();
			candidate=new Candidates(s);
			cty.cand.add(candidate);
			User.hm.put(s,0);
			
		}
	}
	else 
		break;
}
}
static public void user(){
	System.out.println("1.Register for Voting");
	System.out.println("2.Vote for a Candidate");
	int id=sc.nextInt();
		if(id==1){
			int aadhar=sc.nextInt();
			if(aadharno.contains(aadhar)){
				System.out.println("Aadhar number already Registered");
			}
			else{
				aadharno.add(aadhar);
				System.out.println("Your Aadhar Number is successfully Registered");
			}
	        
		}
		else if(id==2){
			System.out.println("Please Enter your Aadhar number");
			int aadhar=sc.nextInt();
			if(aadharno.contains(aadhar)){
				System.out.println("The available Cities are");
				for(int i=0;i<city.size();i++){
					cty=city.get(i);
					System.out.println(cty.getCity());
				}
			}
			else{
				System.out.println("Your Aadhar Number is not registered");
			}
			System.out.print("-------Choose City----------");
			String s=sc.next();
			System.out.println("The Electoral Representatives of "+" "+s+" "+"is");
			for(int i=0;i<cty.cand.size();i++){
				candidate=cty.cand.get(i);
				//System.out.println(cty.cand.size());
				if(s.equals(cty.getCity())){
					System.out.println(cty.cand);
				}
			}
			System.out.println("Enter the person you want to vote");
			String s1=sc.next();
			if(cty.cand.contains(s1)){
				authentication=true;
			}
			if(authentication){
			   User.vote(s1);
			}
			int ch=sc.nextInt();
			if(ch==3){
				System.out.print(User.hm);
			}
				
	}
}
public static void main(String [] args){
	while(true){
	System.out.println("---------Online Voting----------");
	System.out.println("1.Admin Portal");
	System.out.println("2.User Portal");
	int id=sc.nextInt();
	if(id==1){
		admin();
	}
	else
		user();
}
}
}
