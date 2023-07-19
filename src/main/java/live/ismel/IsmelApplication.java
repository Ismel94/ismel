package live.ismel;

import live.ismel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class IsmelApplication implements CommandLineRunner{

  @Autowired
  UserRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(IsmelApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {

  }
}
