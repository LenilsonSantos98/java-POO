public class SistemaCadrasto {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("443", "Marcos");

        // definimos o endereco de marcos
        marcos.setEndereco("Rua das flores");

        // e como definir o cpf do marcos?
        // apos criar o construtor eu passo os parametros na 
        //criação do objeto.

        //imprimindo nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }

}
