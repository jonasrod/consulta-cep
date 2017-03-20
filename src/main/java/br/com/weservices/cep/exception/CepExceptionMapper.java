package br.com.weservices.cep.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class CepExceptionMapper implements ExceptionMapper<CepException> {

	@Override
	public Response toResponse(CepException exception) {
		ExceptionMapping em = new ExceptionMapping(exception.getMessage());
		return Response.status(Status.BAD_REQUEST).entity(em).build();
	}

}
