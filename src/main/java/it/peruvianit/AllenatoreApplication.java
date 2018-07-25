package it.peruvianit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan({"it.peruvianit"})
//@EnableJpaRepositories("it.peruvianit.model.repository")
//@EntityScan("it.peruvianit.model.entity")
@SpringBootApplication
public class AllenatoreApplication{
//public class AllenatoreApplication extends SpringBootServletInitializer{
//    
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(AllenatoreApplication.class);
//    }

	public static void main(String[] args) {
        SpringApplication.run(AllenatoreApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }
}
