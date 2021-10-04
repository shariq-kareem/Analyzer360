package com.example.analyzer360;


import com.example.analyzer360.beans.Wave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaveRepo extends JpaRepository<Wave, String> {
}
