package poo.arthur.introducao;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa arthur = new Pessoa("09533494421","Arthur");

        //definimos o endereço de arthur
        arthur.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do arthur ?

        //imprimindo o arthur sem o nome e cpf
        System.out.println(arthur.getEndereco());
        System.out.println(arthur.getNome() + "-" + arthur.getCpf());
    }
}

