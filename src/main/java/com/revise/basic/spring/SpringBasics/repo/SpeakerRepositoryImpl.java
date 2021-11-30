package com.revise.basic.spring.SpringBasics.repo;

import java.util.ArrayList;
import java.util.List;

import com.revise.basic.spring.SpringBasics.model.Speaker;

public class SpeakerRepositoryImpl implements SpeakerRepository {

	public List<Speaker> getAll() {
		// TODO Auto-generated method stub
		List<Speaker> speakerList = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Paul");
		speaker.setLastName("Heyman");
		
		speakerList.add(speaker);
		
		return speakerList;
		
	}

}
