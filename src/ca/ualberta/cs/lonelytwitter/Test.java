package ca.ualberta.cs.lonelytwitter;

public class Test {
	private String text;
	
	public Test(String t){
		text = t;
	}
	
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		// this is a pointer to the class instance
		// LHS referes to the text attribute, RHS refers
		// to the assignment value.
		this.text = text;
	}
}
