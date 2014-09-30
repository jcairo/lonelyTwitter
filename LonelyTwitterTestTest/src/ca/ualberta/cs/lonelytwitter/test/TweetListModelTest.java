package ca.ualberta.cs.lonelytwitter.test;

import java.util.List;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
	}

	// implemnt a new tweet list model that counts up tweets etc...
	// first test you can make the class
	public void testTweetListModel(){
		TweetListModel tlm = new TweetListModel();
	}
	
	public void testAddTweet(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		// call method to add tweet to the list.
		tlm.addTweet(t);
		assertTrue(tlm.hasTweet(t));
		boolean thrown = false;
		try {
			tlm.addTweet(t);
		}
		catch (IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	public void testGetCount(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		// call method to add tweet to the list.
		assertTrue(tlm.getCount() == 0);
		tlm.addTweet(t);
		assertTrue(tlm.getCount() == 1);
		tlm.removeTweet(t);
		assertTrue(tlm.getCount() == 0);
	}
	
	public void testHasTweet(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hi");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t1);
		assertTrue(tlm.hasTweet(t1));
		assertFalse(tlm.hasTweet(t2));		
	}
	
	public void getTweets(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hi");
		LonelyTweetModel t3 = new LonelyTweetModel("Hey");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t3);
		tlm.addTweet(t1);
		tlm.addTweet(t2);
		// get tweets should return a list in chron order t1, t2, t3
		List<LonelyTweetModel> tweetList = tlm.getTweets();
		assertTrue(tweetList.get(0).getTimestamp().before(tweetList.get(1).getTimestamp()));
		assertTrue(tweetList.get(1).getTimestamp().before(tweetList.get(2).getTimestamp()));
	}

}
