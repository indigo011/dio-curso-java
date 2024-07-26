import javax.swing.*;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Jose", "Joao", "Augusta", "Luiz", "Rafael", "Higor", "Heitor", "Paloma", "Guilherme"};

        imprimirSelecionados(selecionarCandidatos(candidatos, 2000));
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

    //CASE 2
    static String[] selecionarCandidatos(String[] candidatos, double salarioBase) {
        String[] candidatosSelecionados = new String[5];
        var scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < candidatos.length && count < 5; i++) {
            System.out.print("Informe o salário pretendido: ");
            double salarioPretendido = scanner.nextDouble();

            if (analisarCandidato(salarioBase, salarioPretendido)) {
                candidatosSelecionados[count] = candidatos[i];
                count++;
            }
        }

        return candidatosSelecionados;
    }

    //CASE 3
    static void imprimirSelecionados(String[] candidatosSelecionados) {
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

    static void ligar(String[] selecionados) {
        int result = 0;
        int tentativa;

        for (String candidato : selecionados) {
            for (tentativa = 1; tentativa <= 3 && result == 0; tentativa++) {
                System.out.printf("LIGANDO PARA %s... [%d/3] TENTATIVAS\n");
                result = JOptionPane.showConfirmDialog(null, candidato + " atendeu a ligação?",
                        "Ligando...", JOptionPane.YES_NO_OPTION);
                System.out.printf("%s %s A LIGAÇÃO\n", candidato, result == 1 ? "ATENDEU" : "NÃO ATENDEU");
            }
        }
    }
}
