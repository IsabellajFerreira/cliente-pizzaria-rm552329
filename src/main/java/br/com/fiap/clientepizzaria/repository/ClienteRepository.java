package br.com.fiap.clientepizzaria.repository;

import br.com.fiap.clientepizzaria.entity.Cliente;
import org.aspectj.apache.bcel.generic.InstructionConstants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}