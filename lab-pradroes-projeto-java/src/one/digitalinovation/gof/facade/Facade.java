package one.digitalinovation.gof.facade;

import one.digitalinovation.gof.subsitema.cep.CepApi;
import one.digitalinovation.gof.subsitema.crm.CrmService;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
