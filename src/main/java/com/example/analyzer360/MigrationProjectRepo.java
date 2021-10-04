package com.example.analyzer360;

import com.example.analyzer360.beans.MigrationProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrationProjectRepo extends JpaRepository<MigrationProject, String> {
}
