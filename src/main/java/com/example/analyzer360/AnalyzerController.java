package com.example.analyzer360;

import com.example.analyzer360.beans.AnalyzerDsProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyzerController {
    @Autowired
    private DataSourceProfileRepo dataSourceProfileRepo;

    @GetMapping("/get-ds-profiles")
    public List<AnalyzerDsProfile> fetchAnalyzerDsProfiles(){
        return dataSourceProfileRepo.findAll();
    }
}
