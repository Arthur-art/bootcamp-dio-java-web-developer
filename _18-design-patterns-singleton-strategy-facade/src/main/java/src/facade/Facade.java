package src.facade;

import src.facade.subsistemacep.CepApi;
import src.facade.subsistemacrm.CrmService;

public class Facade {

    public void migrarCliete(String nome, String cep){
       String recuperarCidade =  CepApi.getInstance().recuperarCidade(cep);
       String recuperarEstado =  CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarClientes(nome,cep,recuperarCidade,recuperarEstado);

    }
}
