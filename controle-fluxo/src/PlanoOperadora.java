import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M"; //B/M/T/



    switch(plano){
      case "T":{
        System.out.println("5G Youtube");
      }
      case "M":{
        System.out.println("Whats e Instagram Grátis");
      }
      case "B":{
        System.out.println("100 minutos de ligação");
      }
    }

    // if(plano == "B"){
    //   System.out.println("100 minutos de ligação!");
    // }
    // else if(plano == "M"){
    //   System.out.println("100 minutos de ligação!");
    //   System.out.println("Whats e Instagram grátis");
    // }
    // else if(plano == "T"){
    //   System.out.println("100 minutos de ligação!");
    //   System.out.println("Whats e Instagram grátis");
    //   System.out.println("5G Youtube");
    // }
  }
  
}
