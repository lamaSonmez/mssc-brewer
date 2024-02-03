package gurur.springframework.msscbrewer.services;


import gurur.springframework.msscbrewer.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {


    CustomerDTO getCustomerById(UUID customerId);
}
