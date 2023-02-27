package Questao5;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = tc.nextLine();
        
        String palavraInvertida = inverteString(palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);

        tc.close();
    }
    
    public static String inverteString(String palavra) {
        int tamanho = palavra.length();
        char[] caracteres = palavra.toCharArray();
        
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - i - 1];
            caracteres[tamanho - i - 1] = temp;
        }
        
        return new String(caracteres);
    }
}