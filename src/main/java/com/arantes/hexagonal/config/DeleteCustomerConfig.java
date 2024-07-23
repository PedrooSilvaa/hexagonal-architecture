package com.arantes.hexagonal.config;

import com.arantes.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.arantes.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arantes.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.arantes.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.arantes.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.arantes.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
