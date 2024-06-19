package cg.codegym.repository;

import cg.codegym.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
