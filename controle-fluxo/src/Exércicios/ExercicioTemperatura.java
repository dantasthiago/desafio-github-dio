package Exércicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperatura {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);    
    List<Double> temperatura = new ArrayList<>();

    System.out.println("Digite a temperatura para o mês de janeiro");
    Double janeiro = scan.nextDouble();
    temperatura.add(janeiro);

    System.out.println("Digite a temperatura para o mês de fevereiro");
    Double fevereiro = scan.nextDouble();
    temperatura.add(fevereiro);
    System.out.println("Digite a temperatura para o mês de Março");
    Double marco = scan.nextDouble();
    temperatura.add(marco);
    System.out.println("Digite a temperatura para o mês de Abril");
    Double abril = scan.nextDouble();
    temperatura.add(abril);
    System.out.println("Digite a temperatura para o mês de Maio");
    Double maio = scan.nextDouble();
    temperatura.add(maio);
    System.out.println("Digite a temperatura para o mês de Junho");
    Double junho = scan.nextDouble();
    temperatura.add(junho);

    System.out.println("A temperatura para o mês de Janeiro foi de: " + temperatura.get(0));
    System.out.println("A temperatura para o mês de Fevereiro foi de: " + temperatura.get(1));
    System.out.println("A temperatura para o mês de Março foi de: " + temperatura.get(2));
    System.out.println("A temperatura para o mês de Abril foi de: " + temperatura.get(3));
    System.out.println("A temperatura para o mês de Maio foi de: " + temperatura.get(4));
    System.out.println("A temperatura para o mês de Junho foi de: " + temperatura.get(5));

    Iterator<Double> iterator = temperatura.iterator();
    Double soma = 0d;
    while(iterator.hasNext()){
      Double next = iterator.next();
      soma += next;

    }
    System.out.println("A média de temperatura para o primeiro semestre foi de :" + (soma/temperatura.size()));

    scan.close();
    }
    
  }

