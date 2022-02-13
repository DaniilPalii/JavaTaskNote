package daniilpalii.tasknote.data.repositories;

import java.util.List;
import daniilpalii.tasknote.data.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
