package br.com.fiap.clientepizzaria.repository;

import br.com.fiap.clientepizzaria.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {


    public List<Telefone> findByDonoId(Long id);


}