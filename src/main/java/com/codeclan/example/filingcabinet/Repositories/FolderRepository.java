package com.codeclan.example.filingcabinet.Repositories;

import com.codeclan.example.filingcabinet.Projections.EmbedInFolder;
import com.codeclan.example.filingcabinet.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedInFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
