import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        ArrayList<String> perguntas = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        Integer positivo = 0;

        System.out.println("Telefonou para a vítima?");
        String resposta1 = scan.next();
        perguntas.add(resposta1);

        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.next();
        perguntas.add(resposta2);

        System.out.println("Mora perto da vítima?");
        String resposta3 = scan.next();
        perguntas.add(resposta3);

        System.out.println("Devia para a vítima?");
        String resposta4 = scan.next();
        perguntas.add(resposta4);

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scan.next();
        perguntas.add(resposta5);

        Iterator checar = perguntas.iterator();

        while (checar.hasNext()) {
            String resposta = (String)checar.next();
            if (resposta.equals("Sim")) positivo++;
        }

        if (positivo == 2) System.out.println("Você está na lista de suspeitos.");
        else if (positivo == 3 || positivo == 4) System.out.println("Você é um cumplíce. \n TEJE PRESO MELIANTE!");
        else if (positivo == 5) System.out.println("Você é o culpado. \n TEJE PRESO MELIANTE!");
        else System.out.println("Você não tem envolvimento, está liberado!");

    }
}
