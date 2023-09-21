package com.up.Bank.upBank.bankAccount.data.model;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import com.up.Bank.upBank.customer.data.model.Customer;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne ( cascade = CascadeType.ALL)
    private Customer customer;

    private String accountName;

    private String customerEmail;

    private long balance;

    private  static int countAccount;
}
