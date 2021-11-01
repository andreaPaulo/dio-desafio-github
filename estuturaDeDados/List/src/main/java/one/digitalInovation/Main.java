package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();
        listCarros.add(new Carro("ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Renault"));

        System.out.println(listCarros.contains(new Carro("Fiat")));

        System.out.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Renault")));
        System.out.println(listCarros.remove(1));
        System.out.println(listCarros);

    }
}

