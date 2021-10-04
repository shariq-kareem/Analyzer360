package com.example.analyzer360;

import com.example.analyzer360.beans.*;
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

	@Autowired
	private MigrationProjectRepo migrationProjectRepo;

	@Autowired
	private WaveRepo waveRepo;

	@Autowired
	private SchemaRepo schemaRepo;

	@Autowired
	private TableRepo tableRepo;

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
	@Bean
	public void initializeMigrationProject(){
		String analyzerDsProfileId = "0";
		for(int i =0; i<5;i++){
			migrationProjectRepo.save(MigrationProject.builder().
					migrationProjectId(String.valueOf(i))
					.migrationProjectName(analyzerDsProfileId + i).build());
		}
	}
	@Bean
	public void initializewaveProject(){
		String analyzerDsProfileId = "0";
		for(int i =0; i<5;i++){
			waveRepo.save(Wave.builder().
					waveId(String.valueOf(i))
					.waveName(analyzerDsProfileId + i).build());
		}
	}
	@Bean
	public void initializeschemaProject(){
		String analyzerDsProfileId = "0";
		for(int i =0; i<5;i++){
			schemaRepo.save(Schema.builder().
					schemaId(String.valueOf(i))
					.schemaName(analyzerDsProfileId + i).build());
		}
	}
	/*@Bean
	public void initializetableProject(){
		String analyzerDsProfileId = "0";
		for(int i =0; i<5;i++){
			tableRepo.save(Table.builder().
					tableId(String.valueOf(i))
					.tableName(analyzerDsProfileId + i).build());
		}
	}*/
}
