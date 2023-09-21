package com.up.Bank.upBank.bank.data.model;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import com.up.Bank.upBank.appUser.data.model.AppUser;
import com.up.Bank.upBank.bankAccount.data.model.Account;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private final List<Account> listOfAccounts = new ArrayList<Account>();

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private LocationAddress address;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private BankManager bankManager;





}
