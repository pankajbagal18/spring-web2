package com.example.pankaj.springclouddatajpa.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Profile")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer profileId;
	private String name;
	private LocalDate dob;
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", dob=" + dob + "]";
	}
}
