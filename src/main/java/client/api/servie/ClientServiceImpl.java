package client.api.servie;

import client.api.feign.CustomerControllerApiClient;
import client.api.model.CustomerResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    CustomerControllerApiClient apiClient;

    public ClientServiceImpl(CustomerControllerApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public CustomerResponseDto findCustomerById(String id) {
        ResponseEntity<CustomerResponseDto> response = apiClient.getCustustomer(id);
        return Optional
                .ofNullable(response)
                .orElse(null)
                .getBody();
    }
}
