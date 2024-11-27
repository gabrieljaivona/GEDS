package entidade.filho;

import entidade.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("au au au au au au au");
    }
}
