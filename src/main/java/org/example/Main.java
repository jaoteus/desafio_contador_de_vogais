package org.example;

public class Main {

    //    public static java.util.ArrayList<Character> vogais =
//            new java.util.ArrayList<Character>(java.util.Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static int contadorVogais;
    public static String palavra;
    public static boolean temVogal;

    public static void main(String[] args) {
        int i = 0;
        System.out.print("Digite uma palavra: ");
        palavra = scanner.next();
        temVogal = temVogal(palavra);
        if (temVogal) {
            while (i < palavra.length()) {
                if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                    getContadorVogais();
                }
                i++;
            }
            System.out.println("A palavra possui " + contadorVogais + " vogais!");
        } else {
            System.out.println("A palavra não possui vogais!");
        }
    }

    public static boolean temVogal(String palavra) {
        temVogal = palavra.contains("a") || palavra.contains("e") || palavra.contains("i") || palavra.contains("o") || palavra.contains("u");
        return temVogal;
    }

    public static void getContadorVogais() {
        contadorVogais++;
    }
}