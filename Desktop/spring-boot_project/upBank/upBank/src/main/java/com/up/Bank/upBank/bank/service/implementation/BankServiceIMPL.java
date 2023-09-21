package com.up.Bank.upBank.bank.service.implementation;

import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.appUser.appUserException.AppUserException;
import com.up.Bank.upBank.appUser.service.interfaces.AppUserService;
import com.up.Bank.upBank.bank.DTO.reponse.CreateAccountResponse;
import com.up.Bank.upBank.bank.DTO.request.CreateAccountRequest;
import com.up.Bank.upBank.bank.data.repository.BankRepository;
import com.up.Bank.upBank.bank.service.interfaces.BankService;
import com.up.Bank.upBank.bankAccount.DTO.request.AccountRequest;
import com.up.Bank.upBank.bankAccount.data.model.Account;
import com.up.Bank.upBank.bankAccount.service.interfaces.AccountService;
import com.up.Bank.upBank.customer.data.model.Customer;
import com.up.Bank.upBank.customer.service.interfaces.CustomerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class BankServiceIMPL implements BankService {
    private final AppUserService appUserService;
    private final AccountService accountService;
    private final CustomerService customerService;

    @Override
    public CreateAccountResponse registerNewCustomer(CreateAccountRequest createdAccountRequest) {
        String accountName = createdAccountRequest.getFirstName()+" "+createdAccountRequest.getLastName();
        Account foundAccount = accountService.findAccountByCustomerEmail(createdAccountRequest.getEmail());
        if (foundAccount != null && foundAccount.getAccountName().equalsIgnoreCase(accountName)) throw new AppUserException("Savings account already exist");
    if (foundAccount != null && ! foundAccount.getAccountName().equalsIgnoreCase(accountName)){
       return createForExistingCustomer(createdAccountRequest.getEmail());
        }
    Customer customer = customerService.registerNewCustomer(AppUserRequest.builder()
                    .email(createdAccountRequest.getEmail())
                    .lastName(createdAccountRequest.getLastName())
                    .firstName(createdAccountRequest.getFirstName())
                    .address(createdAccountRequest.getAddress())
                    .password(createdAccountRequest.getPassword())
                    .build());
    customer.setCountAccount(customer.getListOfAccounts().size());
 Account account =   accountService.createNewAccount( AccountRequest.builder()
            .customer(customer)
            .build());
        return new CreateAccountResponse(account.getAccountName(), account.getAccountNumber());
    }
    public CreateAccountResponse createForExistingCustomer(String customerEmail){
        Customer foundCustomer = customerService.findCustomerByEmail(customerEmail);
        Account account = Account.builder()
                .customerEmail(customerService.findCustomerByEmail(customerEmail).getAppUser().getEmail())
                .customer(foundCustomer)
                .build();
        accountService.createNewAccount(AccountRequest.builder()
                .customer(foundCustomer)
                .build());
     account =  accountService.createNewAccount(AccountRequest.builder().customer(foundCustomer).build());
     return new CreateAccountResponse(account.getAccountName(), account.getAccountNumber());
    }

}
