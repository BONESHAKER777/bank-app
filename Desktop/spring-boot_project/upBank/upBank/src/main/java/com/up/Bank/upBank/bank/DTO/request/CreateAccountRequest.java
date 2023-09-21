package com.up.Bank.upBank.bank.DTO.request;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import lombok.Data;

@Data
public class CreateAccountRequest {
    private String firstName , lastName , email;
    private String password;
    private LocationAddress address;
}
