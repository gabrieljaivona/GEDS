import entidade.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fabiano", 1.80f, "castanho");
        Pessoa pessoaDesconhecida = new Pessoa();

       pessoa1.imprimirPessoa();

       pessoaDesconhecida.imprimirPessoa();
    }
}