package br.com.weservices.cep.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.weservices.cep.domain.CEP;
import br.com.weservices.cep.domain.Endereco;
import br.com.weservices.cep.exception.CepException;

@Path("/") // caminho do serviço rest complementado pelo @Path do método 
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface CepService {
	
	@POST
	@Path("/endereco")
	public Endereco getEnderecoByCep(CEP cep) throws CepException;
}
