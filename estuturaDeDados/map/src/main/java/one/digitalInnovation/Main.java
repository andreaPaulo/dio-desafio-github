package one.digitalInnovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapAlunos= new HashMap<>();
        mapAlunos.put("Nome", "Maria");
        mapAlunos.put("idade", "13");
        mapAlunos.put("Média", "8.9");
        mapAlunos.put("Turma", "3ºA");

        System.out.println(mapAlunos);
        System.out.println(mapAlunos.keySet());
        System.out.println(mapAlunos.values());

        List<Map<String, String>> listAlunos = new ArrayList();
        listAlunos.add(mapAlunos);
        System.out.println(listAlunos);

        Map<String, String> mapAlunos1= new HashMap<>();
        mapAlunos1.put("Nome", "Pedro");
        mapAlunos1.put("idade", "18");
        mapAlunos1.put("Média", "9.9");
        mapAlunos1.put("Turma", "5ºA");

        System.out.println(mapAlunos1);
        System.out.println(mapAlunos1.containsKey("idade"));
    }
}
