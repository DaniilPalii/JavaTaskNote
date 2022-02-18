package daniilpalii.tasknote.server.data.repositories;

import daniilpalii.tasknote.server.data.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Task, Long> {
    List<Task> findByLastName(String lastName);
    Task findById(long id);
}
