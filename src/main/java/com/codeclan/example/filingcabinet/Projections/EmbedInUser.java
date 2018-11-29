package com.codeclan.example.filingcabinet.Projections;

import com.codeclan.example.filingcabinet.models.Folder;
import com.codeclan.example.filingcabinet.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInUser", types = User.class)
public interface EmbedInUser {

        String getName();
        List<Folder> getFolders();

}
