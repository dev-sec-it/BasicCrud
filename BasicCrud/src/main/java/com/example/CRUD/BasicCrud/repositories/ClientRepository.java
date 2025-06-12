package com.example.CRUD.BasicCrud.repositories;

import com.example.CRUD.BasicCrud.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    public Client findByEmail(String email);
}
