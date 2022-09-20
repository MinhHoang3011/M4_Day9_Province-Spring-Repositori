package com.example.sevice.customer;

import com.example.model.Customer;
import com.example.model.Province;
import com.example.sevice.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

}
