package br.com.weservices.cep.service;



import org.apache.log4j.Logger;

import br.com.weservices.cep.dao.EnderecoDAO;
import br.com.weservices.cep.domain.CEP;
import br.com.weservices.cep.domain.Endereco;
import br.com.weservices.cep.exception.CepException;
import br.com.weservices.cep.exception.DAOException;

/**
 * Classe que implementa um serviço de consulta de endereço 
 * 
 * @author Jonas R. de Oliveira
 *
 */
public class CepServiceImpl implements CepService {
	
	private static final Logger logger = Logger.getLogger(CepServiceImpl.class);
	
	private EnderecoDAO enderecoDao;
	
	/**
	 * Método de consulta de endereço através de um CEP
	 * @param cep 
	 * @return {@link Endereco}
	 */
	@Override
	public Endereco getEnderecoByCep(CEP cep) throws CepException {
		logger.info("getEnderecoByCep inicio: " + cep);
		String cepParam = cep.getCep();
		Endereco endereco = null;
		try {
			endereco = enderecoDao.getEnderecoByCep(cepParam);
			if (endereco == null) {
				StringBuffer sb = null;
		        int lastIndex = cepParam.length() - 1;
		        do {
		        	sb = new StringBuffer();
		        	for (int i = 0; i < cepParam.length(); i++)
		            {
		                int b = cepParam.charAt(i);
		                if (i == lastIndex) {
		                	sb.append("0");
		                	lastIndex--;
		                } else {
		                	sb.append((char) b);
		                }
		            }
		        	cepParam = sb.toString();
		        	if (cepParam.equals("00000000"))
		        		throw new CepException("CEP invalido");
		        } while((endereco = enderecoDao.getEnderecoByCep(cepParam)) == null);
			}
		} catch (DAOException e) {
			logger.error("Erro ao consulta endereço", e);
			throw new CepException(e.getMessage(), e);
		} catch (CepException e) {
			logger.error("CEP invalido", e);
			throw new CepException(e.getMessage(), e);
		}
		return endereco;
	}

	/**
	 * @return the enderecoDao
	 */
	public EnderecoDAO getEnderecoDao() {
		return enderecoDao;
	}

	/**
	 * @param enderecoDao the enderecoDao to set
	 */
	public void setEnderecoDao(EnderecoDAO enderecoDao) {
		this.enderecoDao = enderecoDao;
	}
}
