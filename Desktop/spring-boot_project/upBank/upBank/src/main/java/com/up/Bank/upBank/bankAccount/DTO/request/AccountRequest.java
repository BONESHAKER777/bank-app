package com.up.Bank.upBank.bankAccount.DTO.request;

import com.up.Bank.upBank.customer.data.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {
    private Customer customer;

}
