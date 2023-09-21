package com.up.Bank.upBank.appUser.service.interfaces;

import com.up.Bank.upBank.appUser.DTO.reponse.AppUserResponse;
import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;

public interface AppUserService {

    AppUserResponse registerAppUser(AppUserRequest appUserRequest);

}
