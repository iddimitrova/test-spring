package bg.ivelina.testspring.application;

import bg.ivelina.testspring.entity.Customer;
import bg.ivelina.testspring.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IDD on 7/22/2017.
 */
@SpringBootApplication
@ComponentScan("bg.ivelina")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return new CommandLineRunner(){
            @Override
            public void run(String... strings) throws Exception {
                repository.save(new Customer("Mini", "mini@abv.bg"));
                repository.save(new Customer("Shushi", "shush@abv.bg"));
                System.out.println("Customers found in database:");

                Iterable<Customer> customers = repository.findAll();
                customers.forEach(i->System.out.println(i));
            }
        };
    }
}
