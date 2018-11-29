package com.codeclan.example.filingcabinet.Repositories;

import com.codeclan.example.filingcabinet.Projections.EmbedInUser;
import com.codeclan.example.filingcabinet.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedInUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
