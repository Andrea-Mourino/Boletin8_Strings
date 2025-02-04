public class MayusculaAMinuscula {
    public static void main(String[] args) {
        String palabra = "javeros";

        palabra = palabra.toUpperCase();

        System.out.println(palabra);

        Minuscula(palabra);
    }
    public static void Minuscula (String palabra){

        palabra = palabra.toLowerCase();

        System.out.println(palabra);
    }
}
