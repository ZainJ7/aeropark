package com.zainjanwani.aeropark;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    @Query("SELECT COUNT(c) > 0 FROM Customer c WHERE c.email_address = :email")
    boolean existsByEmail(@Param("email") String email);
}
