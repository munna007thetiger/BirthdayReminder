package com.prorigo.service;

import java.util.List;

import com.prorigo.model.FriendsInfo;

public interface FriendService {

	List<FriendsInfo> getAllFriends();
	public void saveFriend(FriendsInfo friendInfo);
	public void deleteFriendById(long id);
	public FriendsInfo getFriendById(long id);
}   
