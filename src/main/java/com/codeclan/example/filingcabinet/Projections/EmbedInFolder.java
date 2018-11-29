package com.codeclan.example.filingcabinet.Projections;

import com.codeclan.example.filingcabinet.models.File;
import com.codeclan.example.filingcabinet.models.Folder;
import com.codeclan.example.filingcabinet.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInFolder", types = Folder.class)
public interface EmbedInFolder {
    String getTitle();
    List<User> getUsers();
    List<File> getFiles();
}
