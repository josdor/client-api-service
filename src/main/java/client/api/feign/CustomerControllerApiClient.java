package client.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;
import org.springframework.stereotype.Service;

@Service
@FeignClient(name="${customerController.name:customerController}", url="${customerController.url:http://localhost:8081}", configuration = ClientConfiguration.class)
public interface CustomerControllerApiClient extends CustomerControllerApi {
}
