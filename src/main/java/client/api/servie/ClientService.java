package client.api.servie;

import client.api.model.CustomerResponseDto;

public interface ClientService {
    CustomerResponseDto findCustomerById(String id);
}
