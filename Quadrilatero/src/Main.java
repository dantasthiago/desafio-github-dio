public class Main {
    public static void main(String[] args) {
        System.out.println("Exércicio quadrilatero");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado é: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(8,3);
        System.out.println("Área do retângulo é: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 4, 3);
        System.out.println("Área do trapézio é: "+ areaTrapezio);
//        Quadrilatero.area(2);
//        Quadrilatero.area(5d, 2d);
//        Quadrilatero.area(7, 6, 22);
//        Quadrilatero.area(7f, 15f);
    }
}