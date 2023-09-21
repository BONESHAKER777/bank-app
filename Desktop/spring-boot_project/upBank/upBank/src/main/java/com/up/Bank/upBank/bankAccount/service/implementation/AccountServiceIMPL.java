package com.up.Bank.upBank.bankAccount.service.implementation;

import com.up.Bank.upBank.bankAccount.DTO.request.AccountRequest;
import com.up.Bank.upBank.bankAccount.data.model.Account;
import com.up.Bank.upBank.bankAccount.data.repository.AccountRepository;
import com.up.Bank.upBank.bankAccount.service.interfaces.AccountService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class AccountServiceIMPL implements AccountService {
    private final AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public Account createNewAccount(AccountRequest accountRequest) {
        Account account = Account.builder()
                .accountName(accountRequest.getCustomer().getAppUser().getFirstName()+"  " +
                ""+accountRequest.getCustomer().getAppUser().getLastName())
                .accountNumber(String.valueOf(new SecureRandom().ints(100000000,999999999)))
                .customer(accountRequest.getCustomer())
                .customerEmail(accountRequest.getCustomer().getAppUser().getEmail())
                .password(passwordEncoder.encode(accountRequest.getCustomer().getAppUser().getPassword()))
                .build();
                return accountRepository.save(account);
    }

    @Override
    public Account saveBankAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account findAccountByCustomerEmail(String customerEmail) {
        return accountRepository.findByCustomerAppUserEmail( customerEmail);
    }
}
