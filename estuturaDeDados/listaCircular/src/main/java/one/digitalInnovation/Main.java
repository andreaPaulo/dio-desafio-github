package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.add("c0");
        System.out.println(listaCircular);
       
        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("c1");
        System.out.println(listaCircular);

        listaCircular.add("c2");
        listaCircular.add("c3");
        listaCircular.add("c4");
        System.out.println(listaCircular);

        //System.out.println(listaCircular.get(0));
        //System.out.println(listaCircular.get(1));
        //System.out.println(listaCircular.get(2));
      //  System.out.println(listaCircular.get(3));

        for (int i=0; i< 10;i++){
            System.out.println(listaCircular.get(i));
        }
    }
}

