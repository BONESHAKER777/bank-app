package com.up.Bank.upBank.appUser.data.repository;

import com.up.Bank.upBank.appUser.data.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    boolean existsByEmail(String email);

}
