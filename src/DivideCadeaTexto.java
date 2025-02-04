public class DivideCadeaTexto {
    public static void main(String[] args) {
    String frase= "www. javadende0. com";
    frase = frase.replaceAll("\\s" , "").toLowerCase();

    int indice = frase.indexOf('d');

   String primertexto = frase.substring(0 , indice);

   String segundotexto = frase.substring(indice , frase.length());

        System.out.println(primertexto + " " + segundotexto);
    }
}
