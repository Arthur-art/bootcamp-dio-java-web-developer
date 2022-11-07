package src.facade.subsistemacep;

public class CepApi {

    private static CepApi instance = new CepApi();

    public CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Belo Horizonte";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
