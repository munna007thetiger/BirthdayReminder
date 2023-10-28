package com.prorigo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prorigo.model.FriendsInfo;
import com.prorigo.repository.FriendRepository;

@Service
public class FriendServiceImpl implements FriendService{

	@Autowired
	private FriendRepository friendRepository;
	 
	@Override
	public List<FriendsInfo> getAllFriends() {
		return friendRepository.findAll();
		
	}

	@Override
	public void saveFriend(FriendsInfo friendInfo) {
		friendRepository.save(friendInfo);
		
	}

	@Override
	public void deleteFriendById(long id) {
		friendRepository.deleteById(id);
		
	}

	@Override
	public FriendsInfo getFriendById(long id) {
		Optional<FriendsInfo> optional= friendRepository.findById(id);
		FriendsInfo info=null;
		if(optional.isPresent()) {
			info=optional.get();
		}else throw new RuntimeException("Friend Not Found For Id :: "+id);
		
		return info;
	}
	

}
