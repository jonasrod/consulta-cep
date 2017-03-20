package br.com.weservices.cep.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa um CEP para consulta de endereço.
 * @author Jonas R. de Oliveira
 *
 */
@XmlRootElement(name="CEP")
public class CEP {
	private String cep;
	
	/**
	 * @param cep
	 */
	public CEP(String cep) {
		super();
		this.cep = cep;
	}
	
	/**
	 * Constutor default
	 */
	public CEP() {
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "CEP [cep=" + cep + "]";
	}
	
}
