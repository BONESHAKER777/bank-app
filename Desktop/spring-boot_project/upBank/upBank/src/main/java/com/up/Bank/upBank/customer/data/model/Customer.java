package com.up.Bank.upBank.customer.data.model;

import com.up.Bank.upBank.appUser.data.model.AppUser;
import com.up.Bank.upBank.appUser.data.model.Roles;
import com.up.Bank.upBank.bankAccount.data.model.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private AppUser appUser;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private final List<Account> listOfAccounts = new ArrayList<Account>();
    private   int countAccount;


}
