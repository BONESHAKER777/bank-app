package com.up.Bank.upBank.customer.data.model;

import com.up.Bank.upBank.appUser.data.model.AppUser;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    private AppUser appUser;


}
