package Exércicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioSuspeito {

  public static void main(String[] args) {

    

    Scanner scan = new Scanner(System.in);

    List<String> perguntas = new ArrayList<>();

    System.out.println("1.Telefonou para vítima?");
    String p1 = scan.next();
    perguntas.add(p1);
    System.out.println("2.Estava no local do crime?");
    String p2 = scan.next();
    perguntas.add(p2);
    System.out.println("3.Mora perto da vítima?");
    String p3 = scan.next();
    perguntas.add(p3);
    System.out.println("4.Devia para vítima?");
    String p4 = scan.next();
    perguntas.add(p4);
    System.out.println("5.Morava com a vítima?");
    String p5 = scan.next();
    perguntas.add(p5);

    System.out.println(perguntas);

    scan.close();

    int count = 0;
        Iterator<String> contador = perguntas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
  }
  

