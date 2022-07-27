package com.fratt.converter;

import javax.batch.runtime.JobExecution;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.JobParameters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class ConverterApplication {

	public static void main(String[] args) {

	String[] springConfig  = 
	{	
		"spring/batch/config/context.xml",
		"spring/batch/jobs/job-report.xml" 
	};
		
	ApplicationContext context = 
		new ClassPathXmlApplicationContext(springConfig);
		
	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
	Job job = (Job) context.getBean("reportJob");

	try {

		JobExecution execution = (javax.batch.runtime.JobExecution) jobLauncher.run(job, new JobParameters());
		//System.out.println("Exit Status : " + execution.getStatus());

	} catch (Exception e) {
		e.printStackTrace();
	}

	System.out.println("Done");


		SpringApplication.run(ConverterApplication.class, args);
	}

}
