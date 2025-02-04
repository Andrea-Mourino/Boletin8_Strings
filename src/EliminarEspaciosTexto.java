public class EliminarEspaciosTexto {
    public static void main(String[] args) {
        String frase ="James Gosling Created Java";
        frase = frase.replaceAll("\\s" , ""); // \\d es para digito (los numeros)
        System.out.println(frase);
    }
}
