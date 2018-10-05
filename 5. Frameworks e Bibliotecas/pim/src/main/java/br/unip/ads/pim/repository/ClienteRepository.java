package br.unip.ads.pim.repository;

import org.springframework.data.repository.CrudRepository;

import br.unip.ads.pim.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
