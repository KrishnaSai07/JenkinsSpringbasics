package com.revise.basic.spring.SpringBasics.service;

import java.util.List;

import com.revise.basic.spring.SpringBasics.model.Speaker;
import com.revise.basic.spring.SpringBasics.repo.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	SpeakerRepository speakerRepository;
	
	
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		super();
		this.speakerRepository = speakerRepository;
	}

	public void setSpeakerRepository(SpeakerRepository speakerRepo)
	{
		this.speakerRepository = speakerRepo;
	}

	public List<Speaker> getAll() {
		// TODO Auto-generated method stub
		return speakerRepository.getAll();
	}

}
