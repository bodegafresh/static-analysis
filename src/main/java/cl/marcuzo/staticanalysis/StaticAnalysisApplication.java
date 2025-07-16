package cl.marcuzo.staticanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class StaticAnalysisApplication {

	public static void main(String[] args) {
		log.info("iniciando: {}", args.length);
		SpringApplication.run(StaticAnalysisApplication.class, args);
	}

}
