package com.revise.basic.spring.SpringBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revise.basic.spring.SpringBasics.repo.SpeakerRepository;
import com.revise.basic.spring.SpringBasics.repo.SpeakerRepositoryImpl;
import com.revise.basic.spring.SpringBasics.service.SpeakerService;
import com.revise.basic.spring.SpringBasics.service.SpeakerServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="speakerService")
	public SpeakerService getSpeakerService()
	{
		SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
		
		//speakerService.setSpeakerRepository(getSpeakerRepository());
		
		return speakerService;
	}
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository()
	{
		return new SpeakerRepositoryImpl();
	}
	
}
