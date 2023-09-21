package com.up.Bank.upBank.customer.service.interfaces;

import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.customer.DTO.response.CustomerResponse;
import com.up.Bank.upBank.customer.data.model.Customer;

public interface CustomerService {

    Customer registerNewCustomer(AppUserRequest appUserRequest);
    Customer findCustomerByEmail(String email);

}
