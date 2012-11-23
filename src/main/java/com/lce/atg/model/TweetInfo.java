package com.lce.atg.model;

import java.util.Date;

import org.springframework.social.twitter.api.Tweet;

public class TweetInfo extends Tweet {
	
	private String location ;

	public TweetInfo(Tweet tweet) {
		super(tweet.getId(), tweet.getText(), tweet.getCreatedAt(), 
				tweet.getFromUser(), tweet.getProfileImageUrl(), tweet.getToUserId(), 
				tweet.getFromUserId(), tweet.getLanguageCode(), tweet.getSource());
	}
	
	public TweetInfo(long id, String text, Date createdAt, String fromUser,
			String profileImageUrl, Long toUserId, long fromUserId,
			String languageCode, String source) {
		super(id, text, createdAt, fromUser, profileImageUrl, toUserId, fromUserId,
				languageCode, source);
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
