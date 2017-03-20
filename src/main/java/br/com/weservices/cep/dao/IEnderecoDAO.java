package br.com.weservices.cep.dao;

import br.com.weservices.cep.domain.Endereco;
import br.com.weservices.cep.exception.DAOException;

public interface IEnderecoDAO {
	
	public Endereco getEnderecoByCep(String cep) throws DAOException;

}
