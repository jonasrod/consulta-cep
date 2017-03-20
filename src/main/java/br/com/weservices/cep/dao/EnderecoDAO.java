package br.com.weservices.cep.dao;

import java.util.Collection;

import org.apache.log4j.Logger;

import br.com.weservices.cep.domain.Endereco;
import br.com.weservices.cep.exception.DAOException;

public class EnderecoDAO implements IEnderecoDAO {
	
	private static final Logger logger = Logger.getLogger(EnderecoDAO.class);
	
	private Collection<Endereco> enderecos;
	
	@Override
	public Endereco getEnderecoByCep(String cep) throws DAOException {
		logger.info("EnderecoDAO.getEnderecoByCep : " + cep);
		try {
			for (Endereco endereco : enderecos) {
				if (endereco.getCep().equals(cep)) {
					logger.debug("CEP encontrado");
					return endereco;
				}
			}
		} catch (Exception e) {
			logger.error("Erro ao consultar endereço", e);
			throw new DAOException("CEP invalido");
		}
		logger.debug("CEP não encontrado");
		return null;
	}

	/**
	 * @return the enderecos
	 */
	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}

	/**
	 * @param enderecos the enderecos to set
	 */
	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
