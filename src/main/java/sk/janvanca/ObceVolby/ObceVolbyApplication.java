package sk.janvanca.ObceVolby;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sk.janvanca.ObceVolby.controller.NamesController;


@SpringBootApplication
@EnableJpaRepositories
public class ObceVolbyApplication {


	@Autowired
	NamesController namesController;
	

	public static void main(String[] args) {
		SpringApplication.run(ObceVolbyApplication.class, args);

	}



}
