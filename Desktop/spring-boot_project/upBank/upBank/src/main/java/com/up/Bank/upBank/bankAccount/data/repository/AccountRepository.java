package com.up.Bank.upBank.bankAccount.data.repository;

import com.up.Bank.upBank.bankAccount.data.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
