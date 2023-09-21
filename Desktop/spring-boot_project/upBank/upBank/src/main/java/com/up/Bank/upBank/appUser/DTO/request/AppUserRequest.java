package com.up.Bank.upBank.appUser.DTO.request;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppUserRequest {

    private String firstName , lastName , email;
    private String password;
    private LocationAddress address;
}
