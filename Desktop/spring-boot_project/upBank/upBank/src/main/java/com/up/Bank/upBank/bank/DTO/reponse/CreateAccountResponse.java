package com.up.Bank.upBank.bank.DTO.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateAccountResponse {
    private String bankAccountName;
    private String bankAccountNumber;

}
