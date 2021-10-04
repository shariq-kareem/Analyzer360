package com.example.analyzer360.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnalyzerDsProfile {
    @Id
    private String datasourceProfileId;
    private String datasourceProfileName;
}
