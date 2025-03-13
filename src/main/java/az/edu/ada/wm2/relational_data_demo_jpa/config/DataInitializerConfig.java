package az.edu.ada.wm2.relational_data_demo_jpa.config;

import az.edu.ada.wm2.relational_data_demo_jpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializerConfig implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {
        courseRepo.findByStudentsId(2L).forEach(System.out::println);
    }
}
