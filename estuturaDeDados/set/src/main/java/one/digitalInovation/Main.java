package one.digitalInovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set setCarros = new HashSet();
        setCarros.add("Fiat");
        setCarros.add("Ford");
        setCarros.add("Zip");
        setCarros.add("Chevrolet");
        setCarros.add("Peugeot");
        setCarros.add("Alfa Romeo");

        System.out.println(setCarros);

        Set treeSetCarros = new TreeSet();
        treeSetCarros.add("Fiat");
        treeSetCarros.add("Ford");
        treeSetCarros.add("Zip");
        treeSetCarros.add("Chevrolet");
        treeSetCarros.add("Peugeot");
        treeSetCarros.add("Alfa Romeo");

        System.out.println(treeSetCarros);


    }
}
