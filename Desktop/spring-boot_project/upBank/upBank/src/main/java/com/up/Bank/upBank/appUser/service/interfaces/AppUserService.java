package com.up.Bank.upBank.appUser.service.interfaces;

import com.up.Bank.upBank.appUser.DTO.reponse.AppUserResponse;
import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.appUser.data.model.AppUser;

public interface AppUserService {

    AppUser registerAppUser(AppUserRequest appUserRequest);
    AppUser saveAppUser(AppUser appUser);

}
