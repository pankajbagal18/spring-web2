package com.example.pankaj.springclouddatajpa.services;

import java.util.List;

import com.example.pankaj.springclouddatajpa.entity.Profile;

public interface ProfileService {
	public Profile saveProfile(Profile profile);
	public Profile getProfileById(Integer id);
	public List<Profile> getAllProfiles();
	public void deleteProfile(Profile profile);
}
