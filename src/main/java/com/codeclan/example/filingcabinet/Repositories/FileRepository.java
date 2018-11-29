package com.codeclan.example.filingcabinet.Repositories;

import com.codeclan.example.filingcabinet.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
