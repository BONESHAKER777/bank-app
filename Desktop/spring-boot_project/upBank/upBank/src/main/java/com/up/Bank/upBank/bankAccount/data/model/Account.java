package com.up.Bank.upBank.bankAccount.data.model;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import com.up.Bank.upBank.customer.data.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne ( cascade = CascadeType.ALL)
    private Customer customer;

    private String accountName;

    private String customerEmail;

    private long balance;

    private String accountNumber;

    private String password;
}
