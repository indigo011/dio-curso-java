import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        double salarioBase = 2000;
        double salarioPretendido;

        String[] candidatos = {"Felipe", "Marcia", "Jose", "Joao", "Augusta", "Luiz", "Rafael", "Higor", "Heitor", "Paloma", "Guilherme"};
        String[] candidatosSelecionados = new String[5];
        var scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < candidatos.length && count < 5; i++) {
            System.out.print("Informe o salário pretendido: ");
            salarioPretendido = scanner.nextDouble();

            if (analisarCandidato(salarioBase, salarioPretendido)) {
                candidatosSelecionados[count] = candidatos[i];
                count++;
            }
        }

        System.out.println("CANDIDATOS SELECIONADOS --------------");
        boolean flag = false;

        for (String candidato : candidatosSelecionados) {
            if (candidato != null) {
                System.out.println("\t" + candidato);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("\tNenhum candidato foi selecionado \uD83D\uDE41");
        }
    }

    //CASE 1
    static boolean analisarCandidato(double salarioBase, double salarioPretendido) {
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO\n");
            return true;
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA\n");
            return true;
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS...\n");
            return false;
        }
    }
}
