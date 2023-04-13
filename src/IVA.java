public class IVA {
    public static void main(String[] args) {

        System.out.println("Calculando un precio con IVA");
        System.out.println(iva(2500, 21 ));
    }

    //Considerando que el iva es el 21 % en Argentina
    public static double iva (double a, double b) {
        return a * (b/100+1);
    }
}
