package ma.enset.ebankback.repositories;

import ma.enset.ebankback.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomorRepo extends JpaRepository<Customer, Long > {
    
}
