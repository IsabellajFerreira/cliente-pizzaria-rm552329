package br.com.fiap.clientepizzaria.resource;

import br.com.fiap.clientepizzaria.entity.Cliente;
import br.com.fiap.clientepizzaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> findAll(){
        return repository.findAll();
    }

}