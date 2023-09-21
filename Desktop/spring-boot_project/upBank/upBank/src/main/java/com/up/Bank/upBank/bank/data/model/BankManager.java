package com.up.Bank.upBank.bank.data.model;

import com.up.Bank.upBank.appUser.data.model.AppUser;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BankManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private AppUser appUser;
}
