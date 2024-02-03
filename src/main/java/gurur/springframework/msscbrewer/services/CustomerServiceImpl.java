package gurur.springframework.msscbrewer.services;

import gurur.springframework.msscbrewer.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .name("lama")
                .id(UUID.randomUUID())
                .build();
    }
}
