package com.parijat.util;

import com.parijat.model.Like;
import com.parijat.model.Twit;
import com.parijat.model.User;

public class TweetUtil {
	
	public final static boolean isLikedByReqUser(User reqUser, Twit twit) {
		
		for(Like like : twit.getLikes()) {
			if (like.getUser().getId().equals(reqUser.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public final static boolean isRetwitedByReqUser(User reqUser, Twit twit) {
		
		for(User user : twit.getRetwitUser()) {
			if (user.getId().equals(reqUser.getId())) {
				return true;
			}
		}
		return false;
	}

}
