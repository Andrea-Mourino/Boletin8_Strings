public class TransformarCaracteres {
    public static void main(String[] args) {

        String frase = "ABCD";

        String frase2= frase.replace('B' , 'S');
        StringBuilder frase3=  new StringBuilder();
        for (char c: frase.toCharArray()) {
            frase3.append((int)c).append(" ");
        }

        System.out.println("representacion ASCII " + frase3.toString().trim());

    }
}
