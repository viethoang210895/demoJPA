package com.codegym.repository;

import com.codegym.model.Customer;

public interface ICustomerRepository extends IGeneralRepository{
    void save(Customer customer);
}
