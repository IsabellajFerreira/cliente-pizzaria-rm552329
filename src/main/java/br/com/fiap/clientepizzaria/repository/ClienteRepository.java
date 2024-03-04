package br.com.fiap.clientepizzaria.repository;

import br.com.fiap.clientepizzaria.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}