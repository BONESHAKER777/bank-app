package com.up.Bank.upBank.customer.service.implementations;

import com.up.Bank.upBank.appUser.DTO.request.AppUserRequest;
import com.up.Bank.upBank.appUser.appUserException.AppUserException;
import com.up.Bank.upBank.appUser.data.model.Roles;
import com.up.Bank.upBank.appUser.service.interfaces.AppUserService;
import com.up.Bank.upBank.customer.DTO.response.CustomerResponse;
import com.up.Bank.upBank.customer.data.model.Customer;
import com.up.Bank.upBank.customer.data.repository.CustomerRepository;
import com.up.Bank.upBank.customer.service.interfaces.CustomerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class CustomerServiceIMPL implements CustomerService {

    private final CustomerRepository customerRepo;
    private final AppUserService appUserService;

    @Override
    public Customer registerNewCustomer(AppUserRequest appUserRequest) {
   return customerRepo.save(Customer.builder()
                    .appUser(appUserService.registerAppUser(appUserRequest))
            .build());

    }

    @Override
    public Customer findCustomerByEmail(String email) {
        Customer foundCustomer = customerRepo.findCustomerByAppUserEmail(email);
        if(foundCustomer == null) throw new AppUserException("Customer with the Email address  >> "+email+" does not exist");
    return foundCustomer;
    }
}
