package br.com.fiap.clientepizzaria.resource;

import br.com.fiap.clientepizzaria.entity.Cliente;
import br.com.fiap.clientepizzaria.entity.Telefone;
import br.com.fiap.clientepizzaria.repository.ClienteRepository;
import br.com.fiap.clientepizzaria.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    @GetMapping
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable(name = "id") Long id) {
        Cliente cliente = repository.findById( id ).orElse( null );
        if (Objects.isNull( cliente )) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( cliente );
    }

    @GetMapping(value = "/{id}/telefones")
    public ResponseEntity<List<Telefone>> findTelefone(@PathVariable(name = "id") Long id) {
        List<Telefone> telefones = telefoneRepository.findByDonoId( id );
        return ResponseEntity.ok( telefones );
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Cliente> persist(@RequestBody Cliente cliente) {
        Cliente saved = repository.save( cliente );
        return ResponseEntity.ok( saved );
    }

}