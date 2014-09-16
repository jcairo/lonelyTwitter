package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public interface TweetInterface {
	public Date getTweetDate();
	public void setTweetDate(Date tweetDate);
	public String getTweetText();
	public void setTweetText(String tweetText);
	public String getUserName();
	public void setUserName(String userName);
}
