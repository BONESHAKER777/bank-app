package com.up.Bank.upBank.appUser.DTO.reponse;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class AppUserResponse {

private String token;
}
