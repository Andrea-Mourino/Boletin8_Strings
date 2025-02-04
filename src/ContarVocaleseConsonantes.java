public class ContarVocaleseConsonantes {
    public static void main(String[] args) {
        String frase= "java java java";
        frase = frase.replaceAll("\\s" , "").toLowerCase();

        int vocales=0;
        int consonantes=0;

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c=='a' || c=='e' || c=='i' || c=='u' || c=='o') {
                    vocales++;
                }
                else {
                    consonantes++;
                }
            }
        }
        System.out.println("numero de vocales es: " + vocales);
        System.out.println("numero de consonantes es: " + consonantes);
    }
}
