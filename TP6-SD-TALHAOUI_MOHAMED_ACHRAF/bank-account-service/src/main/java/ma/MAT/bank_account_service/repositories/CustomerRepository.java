package ma.MAT.bank_account_service.repositories;

import ma.MAT.bank_account_service.entities.BankAccount;
import ma.MAT.bank_account_service.entities.Customer;
import ma.MAT.bank_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
