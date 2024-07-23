package com.arantes.hexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")  //anotação do mongodb
public class CustomerEntity {
    private String id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean isValidCpf;
}
