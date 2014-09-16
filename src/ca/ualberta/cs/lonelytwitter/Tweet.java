package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements TweetInterface{
	// class reps a tweet
	private Date tweetDate;
	private String TweetText;
	private String UserName;
	
	public Date getTweetDate() {
		return tweetDate;
	}
	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}
	public String getTweetText() {
		return TweetText;
	}
	public void setTweetText(String tweetText) {
		TweetText = tweetText;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public abstract String getLocation();
	public abstract String getLastName();
	

}
