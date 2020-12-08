package com.example.pankaj.springclouddatajpa.services;

import org.springframework.data.repository.CrudRepository;

import com.example.pankaj.springclouddatajpa.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer> {
	
}
