package com.example.analyzer360;

import com.example.analyzer360.beans.AnalyzerDsProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceProfileRepo extends JpaRepository<AnalyzerDsProfile, String> {
}
