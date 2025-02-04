public class StringABCDaASCII {
    public static void main(String[] args) {
        // Declara una variable String con el valor "ABCD"
        String textNotAscii = "ABCD";

        // StringBuilder para construir la representación ASCII
        StringBuilder textAscii = new StringBuilder();

        // Convierte cada carácter de la cadena a su código ASCII
        for (char c : textNotAscii.toCharArray()) {
            textAscii.append((int) c).append(" ");
        }

        // Imprime la representación ASCII de la cadena
        System.out.println("Representación ASCII: " + textAscii.toString().trim());
    }

    }

