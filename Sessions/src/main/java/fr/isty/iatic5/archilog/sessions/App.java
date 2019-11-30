package fr.isty.iatic5.archilog.sessions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.isty.iatic5.archilog.sessions.config.SqlUtils;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SqlUtils sqlUtils = new SqlUtils();
		sqlUtils.connect();
		SpringApplication.run(App.class, args);

	}

}