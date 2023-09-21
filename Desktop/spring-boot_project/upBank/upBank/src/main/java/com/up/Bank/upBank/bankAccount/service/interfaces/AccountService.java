package com.up.Bank.upBank.bankAccount.service.interfaces;

import com.up.Bank.upBank.bankAccount.DTO.request.AccountRequest;
import com.up.Bank.upBank.bankAccount.data.model.Account;

public interface AccountService {

    Account createNewAccount(AccountRequest accountRequest);

    Account saveBankAccount(Account account);

    Account findAccountByCustomerEmail(String customerEmail);

}
