package az.edu.ada.wm2.relational_data_demo_jpa;

import az.edu.ada.wm2.relational_data_demo_jpa.model.Course;
import az.edu.ada.wm2.relational_data_demo_jpa.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RelationalDataDemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationalDataDemoJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CourseRepository courseRepo) {
		return (args)->{
			Course course1 = Course.builder()
					.name("Sociology")
					.description("Some Gened Course")
					.credits(6)
					.build();

			courseRepo.save(course1);
		};
	}

}
