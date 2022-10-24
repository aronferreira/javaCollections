import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<Integer>();
        Integer soma = 0;
        Double media;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual foi a temperatura nos 6 primeiros meses do ano?");
        //Como eu sei que quero 6 valores então coloquei o limitador como 6
        for (int i = 0; i < 6; i++) {
            Integer temperatura = scan.nextInt();
            temp.add(temperatura);
        }

         for (Integer valor : temp) {
             soma += valor;
         }

         media = (double)soma/temp.size();

        System.out.println("Estes foram os meses onde a temperatura foi maior do que a média:");
         for (Integer valor : temp) {
             if (valor > media) {
                 String mes = null;
                 switch (temp.indexOf(valor)) {
                     case 0:
                         mes = "Janeiro";
                         break;
                     case 1:
                         mes = "Fevereiro";
                         break;
                     case 2:
                         mes = "Março";
                         break;
                     case 3:
                         mes = "Abril";
                         break;
                     case 4:
                         mes = "Maio";
                         break;
                     case 5:
                         mes = "Junho";
                         break;
                 }
                 System.out.println("A temperatura no mês de " + mes + " foi: " + valor + "Cº");
             }
         }


    }
}