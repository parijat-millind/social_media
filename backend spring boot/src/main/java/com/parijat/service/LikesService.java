package com.parijat.service;

import java.util.List;

import com.parijat.exception.LikeException;
import com.parijat.exception.TwitException;
import com.parijat.exception.UserException;
import com.parijat.model.Like;
import com.parijat.model.User;

public interface LikesService {
	
	public Like likeTwit(Long twitId, User user) throws UserException, TwitException;
	
	public Like unlikeTwit(Long twitId, User user) throws UserException, TwitException, LikeException;
	
	public List<Like> getAllLikes(Long twitId) throws TwitException;

}
