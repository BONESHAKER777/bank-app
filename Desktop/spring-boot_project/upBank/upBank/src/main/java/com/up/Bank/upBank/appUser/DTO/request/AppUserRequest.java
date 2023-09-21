package com.up.Bank.upBank.appUser.DTO.request;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class AppUserRequest {

    private String firstName , lastName , email;
    private String password;
    private LocationAddress address;
}
