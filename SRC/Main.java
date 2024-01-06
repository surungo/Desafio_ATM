
public class Main {
	public static void main(String[] args) {
		int[] notas = { 2, 5, 10, 20, 50, 100, 200 };
		T.imprimirNotas(notas);
		int valor = T.escolherValor();
		T.printValor(String.valueOf(valor));
		int[] qtNotas = T.calcularQtNotas(notas, valor);
		T.imprimirQtNotas(notas, qtNotas);
	}
}

class T {
	
	public static void imprimirQtNotas(int[] pnotas, int[] pQtNotas) {
		System.out.println("Notas sacadas");
		for (int i = 0; i < pnotas.length; i++) {
			System.out.println(pQtNotas[i] + " notas " + pnotas[i]);
		}
	}

	public static void imprimirQtNotas(int[] pQtNotas) {
	}

	public static int[] calcularQtNotas(int[] pNotas, int pValor) {
		/*
		 * Onde achei o metodo clone do item abaixo
		 * https://www.google.com/search?q=java+clone+object
		 * https://www.digitalocean.com/community/tutorials/java-clone-object-cloning-java
		 */
		int[] pQtNotas = pNotas.clone();
		for (int i = pQtNotas.length-1; i>=0; i--) {
			int nota=pQtNotas[i];
			pQtNotas[i]=0;		
			while(nota<=pValor) {
				pQtNotas[i]++;
				pValor-=nota;				
			}
		}
		return pQtNotas;
	}

	public static void printValor(String text) {
		System.out.println("Valor de saque");
		System.out.println(text);
	}

	public static int escolherValor() {
		int vvalor = 387;
		return vvalor;
	}

	public static void imprimirNotas(int[] pnotas) {
		System.out.println("Notas disponiveis");
		for (int i = 0; i < pnotas.length; i++) {
			System.out.println("notas " + pnotas[i]);
		}
	}
}
