import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Márcia", "José", "João", "Augusta", "Luiz", "Rafael", "Higor", "Heitor", "Paloma", "Guilherme"};
        String[] candidatosSelecionados = selecionarCandidatos(candidatos, 2000);
        imprimirSelecionados(candidatosSelecionados);
        ligar(candidatosSelecionados);

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
        int count = 0;

        for (int i = 0; i < candidatos.length && count < 5; i++) {
            double salarioPretendido = (double) sortear(1500, 3000);
            System.out.printf(
                    "Candidato %d: %s\n\tSalário pretendido: %.2f\n\tSituação: ", i+1, candidatos[i], salarioPretendido
            );
            if (analisarCandidato(salarioBase, salarioPretendido)) {
                candidatosSelecionados[count] = candidatos[i];
                count++;
            }
        }

        return candidatosSelecionados;
    }

    //CASE 3
    static void imprimirSelecionados(String[] candidatosSelecionados) {
        System.out.println("CANDIDATOS SELECIONADOS ----------------------");

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

        System.out.println("----------------------------------------------\n");
    }

    static void ligar(String[] selecionados) {
        for (String candidato : selecionados) {
            int result = 1;
            int tentativa;

            if (candidato == null) {
                break;
            }

            for (tentativa = 1; tentativa <= 3 && result == 1; tentativa++) {
                System.out.printf("\tLigando para %s... Tentativa [%d/3]\n", candidato, tentativa);
                result = sortear(0,1);
            }
            System.out.printf("\n%s %s\n\n", candidato, result == 1 ? "não atendeu 😭" : "atendeu 😍");
        }
    }

    static int sortear(int min,int max) {
        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }
}
