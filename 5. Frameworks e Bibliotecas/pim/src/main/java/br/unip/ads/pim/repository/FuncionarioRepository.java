package br.unip.ads.pim.repository;

import org.springframework.data.repository.CrudRepository;

import br.unip.ads.pim.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

}
