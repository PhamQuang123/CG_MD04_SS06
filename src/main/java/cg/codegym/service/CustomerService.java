package cg.codegym.service;

import cg.codegym.model.Customer;
import cg.codegym.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;


    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return customerRepository.saveWithStoredProcedure(customer);
    }
}
