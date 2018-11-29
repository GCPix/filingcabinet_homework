package com.codeclan.example.filingcabinet.Components;

import com.codeclan.example.filingcabinet.ExtensionType;
import com.codeclan.example.filingcabinet.Repositories.FileRepository;

import com.codeclan.example.filingcabinet.Repositories.FolderRepository;
import com.codeclan.example.filingcabinet.Repositories.UserRepository;
import com.codeclan.example.filingcabinet.models.File;

import com.codeclan.example.filingcabinet.models.Folder;
import com.codeclan.example.filingcabinet.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    public void run(ApplicationArguments args) {
        User user = new User("Gillian");
        userRepository.save(user);

        Folder folder = new Folder("PDR", user);
        folderRepository.save(folder);

        File file = new File("development", ExtensionType.TXT, 64, folder);
        fileRepository.save(file);

    }


}
