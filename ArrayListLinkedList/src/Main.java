import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Double> notas = new ArrayList<>();
       notas.add(7.0);
       notas.add(8.5);
       notas.add(9.3);
       notas.add(5.0);
       notas.add(7.0);
       notas.add(0.0);
       notas.add(3.6);

       System.out.println("Relação de notas: " + notas);
       System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

       System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
       notas.add(4, 8.0);
       System.out.println(notas);

       System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
       System.out.println(notas);
       notas.set(notas.indexOf(5.0), 6.0);

       System.out.println("Confira se a nota 5.0 está na lista: ");
       System.out.println("A nota 5.0 está na lista? R: " + notas.contains(5.0));

       System.out.println("Exiba todos os elementos em ordem de inserção: ");
       for (double nota : notas) System.out.println(nota);
       //Por estarmos usando um list ele por padrão já exibe em ordem de inserção!

       System.out.println("Exiba a terceira nota adicionada: ");
       System.out.println(notas.get(2));

       System.out.println("Exiba a menor nota: ");
       System.out.println(Collections.min(notas));

       System.out.println("Exiba a maior nota: ");
       System.out.println(Collections.max(notas));

       System.out.println("Exiba a soma dos valores: ");
       Iterator<Double> iterator = notas.iterator();
       Double soma = 0d;
       while(iterator.hasNext()){
          Double next = iterator.next();
          soma += next;
       }
       System.out.println("A soma dos valores é: " + soma);

       System.out.println("Exiba a média das notas: ");
       System.out.println("A média é: " + (soma/notas.size()));
       //notas.size() retornará a quantidade de elementos dentro da ArrayList

       System.out.println("Remova a nota 0.0 ");
       notas.remove(0.0);
       System.out.println(notas);

       System.out.println("Remova a nota da posição 0: ");
       notas.remove(0);
       System.out.println(notas);

       Iterator<Double> iterator1 = notas.iterator();
       while(iterator1.hasNext()) {
          Double next = iterator1.next();
          if (next < 7) iterator1.remove();
       }

       /* Ou notas.removeIf(next -> next < 7); */

       System.out.println(notas);

       System.out.println("Apague toda a lista: ");
       notas.clear();
       System.out.println("A lista está vazia? " + notas.isEmpty());

    }
}