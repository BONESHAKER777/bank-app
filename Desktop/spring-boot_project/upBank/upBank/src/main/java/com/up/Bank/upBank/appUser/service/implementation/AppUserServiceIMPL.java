package com.up.Bank.upBank.appUser.service.implementation;

import com.up.Bank.upBank.appUser.DTO.reponse.AppUserResponse;
import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.appUser.service.interfaces.AppUserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class AppUserServiceIMPL implements AppUserService {
    private


    @Override
    public AppUserResponse registerAppUser(AppUserRequest appUserRequest) {
        return null;
    }
}
