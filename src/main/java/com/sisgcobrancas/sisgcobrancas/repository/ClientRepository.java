package com.sisgcobrancas.sisgcobrancas.repository;

import com.sisgcobrancas.sisgcobrancas.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
    Optional<Client> findByCpf(String cpf);
    Optional<Client> findByCnpj(String cnpj);

}