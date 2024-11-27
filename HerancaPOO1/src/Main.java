import entidade.filho.Cachorro;
import entidade.filho.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Mel", 12);
        Gato gato = new Gato("Deunisio", 40);

        System.out.println("Nome: " + cachorro.getNome() + "Idade: " + cachorro.getIdade());
        System.out.println("Nome: " + gato.getNome());
    }
}