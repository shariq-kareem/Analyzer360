package com.example.analyzer360;

import com.example.analyzer360.beans.Schema;
import com.example.analyzer360.beans.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepo  extends JpaRepository<Table,String> {
}
