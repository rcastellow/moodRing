/**
 * 
 */
package com.lce.atg.endpoints.enricher;

import org.apache.log4j.Logger;
import org.springframework.integration.Message;
import org.springframework.social.twitter.api.GeoOperations;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

import com.lce.atg.model.TweetInfo;

/**
 * @author robert
 * 
 */
public class TweetEnricher {

	private static final Logger LOGGER = Logger.getLogger(TweetEnricher.class);

	public TweetInfo enrichHeader(Message<TweetInfo> m) {
		TweetInfo p = (TweetInfo) m.getPayload();
		String userName = p.getFromUser();

		LOGGER.info("Found user: " + userName);
		
		// Look up message using Spring Social
		Twitter twitter = new TwitterTemplate(); // default template works for searching
		TwitterProfile profile = twitter.userOperations().getUserProfile(
				userName);
		GeoOperations geo = twitter.geoOperations();
		
		p.setLocation(profile.getLocation());

		return p;
	}
}
