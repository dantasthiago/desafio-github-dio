package Exemplos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
  public static void main(String[] args) {
    
    System.out.println("Crie uma lista e adicione sete notas: ");
    List<Double> notas = new ArrayList<Double>();
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6);

    System.out.println(notas);

    System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

    System.out.println("Adiciona na lista nota 8.0 na posição 4: ");
    notas.add(4, 8d);
    System.out.println(notas);

    System.out.println("Substítua a nota 5.0 por 6.0:");
    notas.set(notas.indexOf(5d), 6d);
    System.out.println(notas);

    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

    // System.out.println("Exiba todas as notas em ordem que foram informados: ");
    // for(double nota : notas) System.out.println(nota);

    System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

    System.out.println("Exiba a menor nota:" + Collections.min(notas));

    System.out.println("Exiba a maior nota adicionada: " + Collections.max(notas));

    System.out.println("Exiba a soma dos valores: ");
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while(iterator.hasNext()){
      Double next = iterator.next();
      soma += next;
    }
    System.out.println(soma);

    System.out.println("Exiba a média da notas: " + (soma/notas.size()));

    System.out.println("Remova a nota 0 da lista: ");
    notas.remove(0d);
    System.out.println(notas);

    System.out.println("Remova a nota na posição 0: ");
    notas.remove(0);
    System.out.println(notas);

    System.out.println("Remova as notas menores que 7 e exiba a lista:");
    Iterator<Double> iterator2 = notas.iterator();
    while(iterator2.hasNext()){
      Double next = iterator2.next();
      if(next <=7d) iterator2.remove();
    }
    System.out.println(notas);

    System.out.println("Apague todos os itens da lista: ");
    // notas.clear();
    System.out.println(notas);

    System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    

  }
}
