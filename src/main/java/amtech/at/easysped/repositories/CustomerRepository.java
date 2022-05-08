package amtech.at.easysped.repositories;

import amtech.at.easysped.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
