package com.learnleadgrow.ut.TestingDemo.repository;

import com.learnleadgrow.ut.TestingDemo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
