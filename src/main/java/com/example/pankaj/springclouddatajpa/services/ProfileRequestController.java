package com.example.pankaj.springclouddatajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pankaj.springclouddatajpa.entity.Profile;

@RestController
@RequestMapping("profile")
public class ProfileRequestController {

	@Autowired
	private ProfileService profileService;
	
	@GetMapping(path = {"/greetings"})
	public String greetings() {
		return "Hello from ProfileRequestController";
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,path= {"/save"})
	public Profile saveProfile(@RequestBody Profile profile) {
		return profileService.saveProfile(profile);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,path = {"/all"})
	public List<Profile> getAllProfiles(){
		return profileService.getAllProfiles();
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,path= {"/search{id}"})
	public Profile getProfileById(Integer id) {
		return profileService.getProfileById(id);
	}
}
