package com.up.Bank.upBank.customer.data.repository;

import com.up.Bank.upBank.customer.data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
