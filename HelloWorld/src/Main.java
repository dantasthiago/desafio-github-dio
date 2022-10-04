import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    int resultado = soma(2, 3);
        System.out.println(resultado);

//        String nomeOriginal = "Thiago";
//        saudacao(nomeOriginal);
    }

    public static int soma(int a, int b){
        return a + b;












//    public static void saudacao(String nomeParametro){
//        System.out.println("Hello, "+ nomeParametro);
    }
}



// boolean resultado = false;

//boolean fimDeSemana = true;
//boolean fazendoSol = true;
//boolean vamosAPraia = fimDeSemana && fazendoSol;

//Operadores
//
// E = &&
//true && true = true
//true && false = false
//false && true = false
//false && false = false

//ou = || (OR)
//true || true = true
//true || false = true
//false || true = true
//false || false = false


// System.out.println(vamosAPraia);

//String mensagem = fimDeSemana ? "É fim de semana" :  "Não é fim de semana";
//System.out.println(mensagem);


//Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!

//String nome = "Thiago";

//ISO 8601 - DATA PADRÃO

//LocalDate hoje = LocalDate.now();
//LocalDateTime agora = LocalDateTime.now();
//Locale brasil = new Locale("pt",  "BR");

//Locale brasil = new Locale("pt",  "BR");
//String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
//String saudacao;
//if(agora.getHour() >= 0 && agora.getHour() < 12){
//     saudacao = "Bom dia";
//} else if(agora.getHour() >= 12 && agora.getHour() < 18){
//    saudacao = "Boa tarde";
//} else if(agora.getHour() >= 18 && agora.getHour() < 24 ){
//    saudacao = "Boa noite";
//} else{
//    saudacao = "";
// }
//System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());


// 1 2 3 4 5 6 7 8 9 10
// para uma variavel que inicia em 1, e vai até 10, mudando 1 po 1
//for (int i = 1; i <=10; i++){
//for (int j = 1; j<=10; j++){
//    System.out.println(j + " x " + i + " = " + j * i);
//}
//}


//int[] numeros = new int[5];
//numeros[0] = 1;
//numeros[1] = 2;
//numeros[2] = 3;
// numeros[3] = 4;
// numeros[4] = 5;
//for (int i=0 ; i < numeros.length; i++)
//System.out.println(numeros[i]);

//        String[] letras = new String[5];
//        letras[0] = "A";
//        letras[1] = "C";
//        letras[2] = "E";
//        letras[3] = "G";
//        letras[4] = "T";
//
//        for(int i=0; i<letras.length; i++)
//            System.out.println(letras[i]);
//        String[] letras = {"T", "H", "I", "A", "G", "O"};
//        for(int i=0; i< letras.length; i++){
////        System.out.println(letras[i]);
//        }
//        System.out.println(Arrays.toString(letras));


//        int[] numeros = {9, 20, 5, 40};
//        int maior = numeros[0];
//        int menor = numeros[0];
//        int media = 0;
//
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] > maior) {
//                maior = numeros[i];
//            }
//            if (numeros[i] < menor) {
//                menor = numeros[i];
//            }
//            media += numeros[i];
//        }
//        System.out.println("MAIOR: " + maior );
//        System.out.println("MENOR: " + menor);
//        System.out.println("MÉDIA: " + media/numeros.length);