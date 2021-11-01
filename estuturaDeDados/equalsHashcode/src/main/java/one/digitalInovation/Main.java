package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> carro = new ArrayList<>();
        carro.add(new Carro("Ford"));
        carro.add(new Carro("Chevrolet"));
        carro.add(new Carro("Volkswagem"));

        System.out.println(carro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));

    }
}
