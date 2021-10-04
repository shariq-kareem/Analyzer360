package com.example.analyzer360;

import com.example.analyzer360.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyzerController {
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

    @GetMapping("/get-ds-profiles")
    public List<AnalyzerDsProfile> fetchAnalyzerDsProfiles(){
        return dataSourceProfileRepo.findAll();
    }

    @GetMapping("/get-migration-projects")
    public List<MigrationProject> fetchMigrationProject(){
        return migrationProjectRepo.findAll();
    }

    @GetMapping("/get-waves")
    public List<Wave> getWaves(){
        return waveRepo.findAll();
    }
    @GetMapping("/get-schema")
    public List<Schema> getSchemas(){
        return schemaRepo.findAll();
    }

    @GetMapping("/get-tables")
    public List<Table> getTables(){
        return tableRepo.findAll();
    }
}
