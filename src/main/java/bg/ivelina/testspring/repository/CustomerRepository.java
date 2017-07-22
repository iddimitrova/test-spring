package bg.ivelina.testspring.repository;

import bg.ivelina.testspring.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IDD on 7/22/2017.
 */
public interface CustomerRepository  extends CrudRepository<Customer, Long>{
}
