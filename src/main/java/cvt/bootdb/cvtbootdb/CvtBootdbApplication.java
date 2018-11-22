package cvt.bootdb.cvtbootdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CvtBootdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvtBootdbApplication.class, args);
	}
}
