package com.up.Bank.upBank.appUser.service.implementation;

import com.up.Bank.upBank.appUser.DTO.reponse.AppUserResponse;
import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.appUser.appUserException.AppUserException;
import com.up.Bank.upBank.appUser.data.model.AppUser;
import com.up.Bank.upBank.appUser.data.repository.AppUserRepository;
import com.up.Bank.upBank.appUser.service.interfaces.AppUserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class AppUserServiceIMPL implements AppUserService {
    private final AppUserRepository appUserRepository;


    @Override
    public AppUser registerAppUser(AppUserRequest appUserRequest) {
if (appUserRepository.existsByEmail(appUserRequest.getEmail())) throw new AppUserException("email already exists >> "+appUserRequest.getEmail());
 return appUserRepository.save(
  AppUser.builder()
          .address(appUserRequest.getAddress())
          .password(appUserRequest.getPassword())
          .email(appUserRequest.getEmail())
          .lastName(appUserRequest.getLastName())
          .firstName(appUserRequest.getFirstName())
          .registrationDate(LocalDateTime.now())
          .build()
);

    }


    public AppUser saveAppUser(AppUser appUser){
        return appUserRepository.save(appUser);
    }
}
