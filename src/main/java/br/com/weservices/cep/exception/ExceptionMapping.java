package br.com.weservices.cep.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExceptionMapping {
	private String message;
	
	/**
	 * @param message
	 */
	public ExceptionMapping(String message) {
		super();
		this.message = message;
	}

	/**
	 * Construtor default
	 */
	public ExceptionMapping() {
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
