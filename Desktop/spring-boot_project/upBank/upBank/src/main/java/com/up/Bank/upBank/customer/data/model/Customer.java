package com.up.Bank.upBank.customer.data.model;

import com.up.Bank.upBank.appUser.data.model.AppUser;
import com.up.Bank.upBank.bankAccount.data.model.Account;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private AppUser appUser;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private final List<Account> listOfAccounts = new ArrayList<Account>();
}
