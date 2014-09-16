package ca.ualberta.cs.lonelytwitter;

public class Test2 extends Test {
	public Test2(String t){
		// class the constructor of the super class
		super(t);
		// this calls the parents set text
		setText("Hello" + t);
	}
}
