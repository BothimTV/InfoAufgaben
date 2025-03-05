public class Vigenere {

    public static void main(String[] args) {
        final String geheimtext = "Ich bin ein super sicherer Text";
        final String verschluesselt = encodeVigener("FickDieAfd", geheimtext);
        System.out.println(verschluesselt);
        final String entschluesselt = decodeVigener("FickDieAfd", verschluesselt);
        System.out.println(entschluesselt);
    }

    public static String encodeVigener(String key, String text) {
        String encoded = "";
        key = key.toUpperCase();
        text = text.toUpperCase()
                .replaceAll(" ", "");
        for (int i = 0; i < text.length(); i++) {
            int verschiebung = key.charAt(i % key.length()) - 'A';
            int neuAsci = text.charAt(i);
            char neu = (char) (neuAsci + verschiebung);
            if (neu > 'Z') {
                neu = (char) (neu - 26);
            }
            encoded += neu;
        }
        return encoded;
    }

    public static String decodeVigener(String key, String encrypted) {
        String decoded = "";

        for (int i = 0; i < encrypted.length(); i++) {
            int offset = key.charAt(i % key.length()) - 'A';
            int neuAsci = encrypted.charAt(i);
            char neu = (char) (neuAsci - offset);
            if (neu < 'A') {
                neu = (char) (neu + 26);
            }
            decoded += neu;
        }
        return decoded;
    }

}