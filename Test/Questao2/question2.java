package Questao2;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = tc.nextInt();
        
        // Calcula a sequência de Fibonacci até o número informado
        int a = 0, b = 1, c;
        boolean encontrado = false;
        while (b <= num) {
            if (b == num) {
                encontrado = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        tc.close();
        
        // Verifica se o número pertence ou não à sequência de Fibonacci
        if (encontrado) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}