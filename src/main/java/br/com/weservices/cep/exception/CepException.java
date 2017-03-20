package br.com.weservices.cep.exception;

public class CepException extends Exception {
	
	private static final long serialVersionUID = -123841647123141405L;

	/**
	 * Construtor padrão, passando apenas a exceção de origem.
	 * 
	 * @param cause
	 * 				Exceção de origem.
	 */
	public CepException(final Exception cause) {
		super(cause);
	}

	/**
	 * Construtor padrão, passando apenas uma mensagem para a exceção.
	 * 
	 * @param message
	 * 				Descrição do erro ocorrido.
	 */
	public CepException(final String message) {
		super(message);		
	}

	/**
	 * Construtor que recebe uma mensagem e a exceção de origem.
	 * 
	 * @param message
	 * 				Descrição do erro ocorrido.
	 * @param cause
	 * 				Exceção de origem.
	 */
	public CepException(final String message, final Exception cause) {
		super(message, cause);		
	}
}
