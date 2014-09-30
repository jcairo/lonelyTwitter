package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void addTweet(LonelyTweetModel t) {
		// Should throw exception if you try to add a tweet thats
		// already in the list
		if (tweets.contains(t)){
			throw new IllegalArgumentException();
		} else {
			tweets.add(t);
		}
		
	}

	public boolean hasTweet(LonelyTweetModel t) {
		// Throw illegal argument exception 
		return tweets.contains(t);
	}

	public int getCount() {
		// count the elements in the arra list
		return tweets.size();
	}

	public void removeTweet(LonelyTweetModel t) {
		// removes a tweet from the aray list
		tweets.remove(t);
		
	}

	public List<LonelyTweetModel> getTweets() {
		// return a list of chronologically sorted tweets.
		List<LonelyTweetModel> tweetList = (List<LonelyTweetModel>) tweets;
		Collections.sort(tweetList);
		return tweetList;
	}
	

	
}
