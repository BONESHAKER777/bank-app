package com.up.Bank.upBank.address.data.repository;

import com.up.Bank.upBank.address.data.model.LocationAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationAddressRepository extends JpaRepository<LocationAddress, Long> {
}
