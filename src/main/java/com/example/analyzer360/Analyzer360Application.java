package com.example.analyzer360;

import com.example.analyzer360.beans.AnalyzerDsProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Analyzer360Application {
	@Autowired
	private DataSourceProfileRepo dataSourceProfileRepo;

	public static void main(String[] args) {
		SpringApplication.run(Analyzer360Application.class, args);
	}

	@Bean
	public void initializeDsProfilesList(){
		String profileName = "ds_profile";
		for(int i =0; i<5;i++){
			dataSourceProfileRepo.save(AnalyzerDsProfile.builder().
					datasourceProfileId(String.valueOf(i))
					.datasourceProfileName(profileName + i).build());
		}
	}
}
