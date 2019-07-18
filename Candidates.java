package voting;
public class Candidates {
	String s;
public Candidates(String si){
	this.s=si;
}
public String getcandidate(){
	return s;
}
@Override
public String toString() {
	return "Candidates [s=" + s + "]";
}
}
