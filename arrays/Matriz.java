package arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita a quantidade de alunos e notas
        System.out.print("Digite a quantidade de Alunos: ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        int qtdeNotas = entrada.nextInt();

        // Declaração e inicialização das variáveis
        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double total = 0;

        // Preenche o array com as notas e acumula o total
        for (int a = 0; a < qtdeAlunos; a++) {  // Controle do loop sobre os alunos
            for (int n = 0; n < qtdeNotas; n++) {  // Controle do loop sobre as notas
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();  // Lê a nota e armazena no array
                total += notasDaTurma[a][n];  // Acumula a nota para o cálculo da média
            }
        }

        // Calcula e exibe a média da turma
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("A média da turma é: " + media);

        entrada.close();
    }
}
