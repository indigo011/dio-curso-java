import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = input.nextInt();

        try {
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.print("Algo deu errado: " + e);
        }
    }

    static void contar(int parametroUM, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUM > parametroDois) {
            throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro!");
        } else {
            int contador = parametroDois - parametroUM;
            
            for (int i = 1; i <= contador; i++) {
                System.out.printf("\n\tImprimindo o número %d", i);
            }
        }
    }

}
