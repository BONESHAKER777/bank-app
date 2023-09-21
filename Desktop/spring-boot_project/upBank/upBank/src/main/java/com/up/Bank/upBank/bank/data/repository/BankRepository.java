package com.up.Bank.upBank.bank.data.repository;

import com.up.Bank.upBank.bank.data.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {

}
