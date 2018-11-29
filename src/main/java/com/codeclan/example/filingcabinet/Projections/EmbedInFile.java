package com.codeclan.example.filingcabinet.Projections;

import com.codeclan.example.filingcabinet.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedInFile", types = File.class)
public interface EmbedInFile {

}
