package com.arantes.hexagonal.adapters.in.controller.response;

import com.arantes.hexagonal.adapters.out.client.response.AddressResponse;

public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
