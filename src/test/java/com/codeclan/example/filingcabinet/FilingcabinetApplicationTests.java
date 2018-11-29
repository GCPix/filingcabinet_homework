package com.codeclan.example.filingcabinet;

//import com.codeclan.example.filingcabinet.Repositories.FileRepository;
import com.codeclan.example.filingcabinet.Repositories.FileRepository;
import com.codeclan.example.filingcabinet.Repositories.FolderRepository;
import com.codeclan.example.filingcabinet.Repositories.UserRepository;
//import com.codeclan.example.filingcabinet.models.File;
import com.codeclan.example.filingcabinet.models.File;
import com.codeclan.example.filingcabinet.models.Folder;
import com.codeclan.example.filingcabinet.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilingcabinetApplicationTests {
//	@Autowired
//	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void cancreateUser() {
		User user = new User("Gillian");
		userRepository.save(user);
	}

	@Test
	public void canCreateFolder() {
		User user = new User("Gillian");
		userRepository.save(user);

		Folder folder = new Folder("PDR", user);
		folderRepository.save(folder);

	}

	@Test
	public void canCreateFile() {
		User user = new User("Gillian");
		userRepository.save(user);

		Folder folder = new Folder("PDR", user);
		folderRepository.save(folder);

		File file = new File("personnel", ExtensionType.JAVA, 560, folder);
		fileRepository.save(file);

	}
}
