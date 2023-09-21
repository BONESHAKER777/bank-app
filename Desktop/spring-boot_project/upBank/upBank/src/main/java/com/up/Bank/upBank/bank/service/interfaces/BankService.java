package com.up.Bank.upBank.bank.service.interfaces;

import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.bank.DTO.reponse.CreateAccountResponse;
import com.up.Bank.upBank.bank.DTO.request.CreateAccountRequest;

public interface BankService {


    CreateAccountResponse registerNewCustomer(CreateAccountRequest createdAccountRequest);


}
