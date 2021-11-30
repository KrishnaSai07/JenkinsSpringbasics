package com.revise.basic.spring.SpringBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revise.basic.spring.SpringBasics.service.SpeakerService;

/**
 * Hello world!
 *
 */
public class ApplicationMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Main class ...." );
        
//        SpeakerService speakerService = new SpeakerServiceImpl();
//        System.out.println(speakerService.getAll().get(0).getFirstName());
        
        @SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        
        System.out.println(service.getAll().get(0).getFirstName());
        
    }
}
