package cg.codegym.service;

import cg.codegym.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
