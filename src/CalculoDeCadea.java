public class CalculoDeCadea {
    public static void main(String[] args) {
        String frase = "Ola, son alumno de DAM1, e son programador desde o 2024";
        cadena(frase);
    }

    public static void cadena (String sims4) {

        int letras=0;
        int digitos=0;
        int espacios=0;

        for (char c: sims4.toCharArray()) {

            if (Character.isLetter(c)) {
                letras++;
            }
            if (Character.isDigit(c)) {
                digitos++;
            }

            else if (Character.isWhitespace(c)){
                espacios++;
            }



        }
    }
}
