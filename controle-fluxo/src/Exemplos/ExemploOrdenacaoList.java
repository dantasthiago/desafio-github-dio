package Exemplos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

  // Dada as seguintes informações sobre gatos, crie uma lista e
  // e ordene esta lista exibindo:
  // (nome - idade - cor)
  
//   Gato1 = nome: Jon, idade: 18, cor: preto
//   Gato2 = nome: Simba, idade: 6, cor: tigrado
//   Gato3 = nome: Jon, idade: 12, cor: amarelo
    
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    List<Gato> meusGatos = new ArrayList<>(){{
      add(new Gato("Jon", 18, "preto"));
      add(new Gato("Simba", 6, "tigrado"));
      add(new Gato("Jon", 12, "amarelo"));
    }};
    System.out.println("---\tOrdem de Inserção\t---");
    System.out.println(meusGatos);

    System.out.println("---\tOrdem de Aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("---\tOrdem de Natural (Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);
    
    System.out.println("---\tOrdem Idade\t---");
    Collections.sort(meusGatos, new ComparaIdade());
    // meusGatos.sort(new ComparaIdade());
    System.out.println(meusGatos);

    System.out.println("---\tOrdem cor\t---");
    Collections.sort(meusGatos, new ComparaCor());
    // meusGatos.sort(new ComparaCor());
    System.out.println(meusGatos);
    
    System.out.println("---\tOrdem Nome/cor/Idade\t---");
    Collections.sort(meusGatos, new ComparaNomeCorIdade());
    // meusGatos.sort(new ComparaNomeCorIdade());
    System.out.println(meusGatos);
  }
  
  
  
}
class Gato implements Comparable<Gato>{
  private String nome;
  private int idade;
  private String cor;
  
  
  public Gato(String nome, int idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }


  public String getNome() {
    return nome;
  }


  public int getIdade() {
    return idade;
  }


  public String getCor() {
    return cor;
  }


  @Override
  public String toString() {
    return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
  }


  @Override
  public int compareTo(Gato gato) {
    // TODO Auto-generated method stub
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }


}

class ComparaIdade implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
    // TODO Auto-generated method stub
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }

}

class ComparaCor implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
    // TODO Auto-generated method stub
    return g1.getCor().compareTo(g2.getCor());
  }

}
class ComparaNomeCorIdade implements Comparator<Gato>{
  @Override
  public int compare(Gato g1, Gato g2) {
    // TODO Auto-generated method stub
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if(nome != 0) return nome; 

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if(cor != 0) return cor;

    return Integer.compare(g1.getIdade(), g2.getIdade()); 
  }
  
}


