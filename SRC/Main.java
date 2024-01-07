import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] notas = { 200, 100, 50, 20, 10, 5, 2 };
    int[] QtNotas = { 0, 0, 0, 0, 0, 0, 0 };
    boolean in = true;

    System.out.println("Bem vindo ao Atmdente!");

    while (in) {
      System.out.println("O que voce gostaria de fazer hoje?");
      System.out.println("Visualizar Carteira (1) - Depositar (2) - Sacar (3) - Encerrar (4)");
      Scanner scanner = new Scanner(System.in);
      int escolha = scanner.nextInt();

      switch (escolha) {
        case 1:
          T.imprimirNotas(notas, QtNotas);
          System.out.println("O valor total da sua carteira e de: " + T.valorTotaldaCarteira(notas, QtNotas) + " R$");
          break;
        case 2:
          T.adicionarQtNotas(notas, QtNotas);
          break;
        case 3:
          System.out.println("Digite o Valor a ser sacado!");
          int valor = scanner.nextInt();
          T.calcularNotasSacadas(notas, valor, QtNotas);
          break;
        case 4:
          System.out.println("Encerrando Sistema!");
          in = false;
          break;
        default:
          System.out.println("Nenhuma das Opcoes disponiveis");
      }
    }
  }
}

class T {

  // Mostra o Valor total da Carteira
  public static int valorTotaldaCarteira(int[] pNotas, int[] QtNotas) {
    int valorTotal = 0;
    for (int i = 0; i < pNotas.length; i++) {
      valorTotal += pNotas[i] * QtNotas[i];
    }
    return valorTotal;
  }

  // Imprime quantas notas o Caixa tem
  public static void imprimirNotas(int[] pNotas, int[] QtNotas) {
    System.out.println("Notas Disponiveis");
    for (int i = 0; i < pNotas.length; i++) {
      System.out.println(QtNotas[i] + " notas " + pNotas[i]);
    }
  }

  // Adiciona Notas ao Caixa.
  public static int[] adicionarQtNotas(int[] notas, int[] QtNotas) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < QtNotas.length; i++) {
      System.out.println("Digite a quantidade de notas: " + notas[i]);
      int notaQt = scanner.nextInt();
      QtNotas[i] += notaQt;
    }
    return QtNotas;
  }

  // Calcula a quantidade das notas necessárias referentes ao valor inserido
  public static int[] calcularNotasSacadas(int[] pNotas, int pValor, int[] QtNotas) {
    int[] QtNotasNec = { 0, 0, 0, 0, 0, 0, 0 };
    for (int i = 0; i < pNotas.length; i++) {
      while (pValor >= pNotas[i] && QtNotas[i] > 0) {
        pValor -= pNotas[i];
        QtNotasNec[i]++;
        QtNotas[i]--;
      }
    }
    // Imprime o total de cada nota utilizada
    for (int i = 0; i < pNotas.length; i++) {
      if (QtNotasNec[i] > 0) {
        System.out.println("Nota de " + pNotas[i] + ": " + QtNotasNec[i] + " sacada(s).");
      }
    }

    // Confere se há notas o suficiente para cobrir o valor
    if (pValor != 0) {
      System.out.println("Sentimos muito! Nao temos notas o suficiente para sacar o total!");
    } else {
      System.out.println("Saque realizado com sucesso!");
    }

    return QtNotasNec;
  }

  /*
   * Printar o valor da variável "VALOR" - Inutilizado
   * public static void printValor(int x) {
   * System.out.println("Valor de saque");
   * System.out.println(x);
   * }
   */

  /*
   * Só escolher o valor da variável "VALOR" - Inutilizado
   * public static int escolherValor(int x) {
   * int valor = x;
   * return valor;
   * }
   */
}
