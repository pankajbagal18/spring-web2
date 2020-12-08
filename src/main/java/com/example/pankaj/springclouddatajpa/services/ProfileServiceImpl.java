package com.example.pankaj.springclouddatajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pankaj.springclouddatajpa.entity.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Profile saveProfile(Profile profile) {
		// TODO Auto-generated method stub
		return profileRepository.save(profile);
	}

	@Override
	public Profile getProfileById(Integer id) {
		// TODO Auto-generated method stub
		return profileRepository.findById(id).get();
	}

	@Override
	public List<Profile> getAllProfiles() {
		// TODO Auto-generated method stub
		return (List<Profile>) profileRepository.findAll();
	}

	@Override
	public void deleteProfile(Profile profile) {
		// TODO Auto-generated method stub
		profileRepository.delete(profile);
	}

}
