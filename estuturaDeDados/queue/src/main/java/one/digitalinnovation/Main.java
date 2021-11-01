package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ferrari"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);
        // retorna false se não conseguir adicionar
        System.out.println(queueCarros.offer(new Carro("Renault")));

        //Retorna o 1º da fila,mas não remove se não tiver retorna null
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Retorna o 1º da fila e remove, se não tiver retorna null
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());



    }
}
