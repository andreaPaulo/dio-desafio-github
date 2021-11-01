package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
        minhaListaEncadeada.add("No1");
        minhaListaEncadeada.add("No2");
        minhaListaEncadeada.add("No3");
        minhaListaEncadeada.add("No4");
        minhaListaEncadeada.add("No5");
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);

    }
}
