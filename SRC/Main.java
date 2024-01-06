import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date data_inicio = new Date();
		int[] notas = { 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000, 5000000 };
		T.imprimirNotas(notas);
		int valor = T.escolherValor();
		T.printValor(String.valueOf(valor));
		int[] qtNotas = T.calcularQtNotas(notas, valor);
		T.imprimirQtNotas(notas, qtNotas);
		/*
		 * 
		 */
		
		T.findDifference(data_inicio, new Date());
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
		int vvalor =  8888888;
		return vvalor;
	}

	public static void imprimirNotas(int[] pnotas) {
		System.out.println("Notas disponiveis");
		for (int i = 0; i < pnotas.length; i++) {
			System.out.println("notas " + pnotas[i]);
		}
	}
	
	public static void
    findDifference(Date d1,
                   Date d2)
    {
        // Calculate time difference
		// in milliseconds
		long difference_In_Time
		    = d2.getTime() - d1.getTime();
 
		// Calculate time difference in
		// seconds, minutes, hours, years,
		// and days
		long difference_In_Seconds
		    = (difference_In_Time
		       / 1000)
		      % 60;
 
		long difference_In_Minutes
		    = (difference_In_Time
		       / (1000 * 60))
		      % 60;
 
		long difference_In_Hours
		    = (difference_In_Time
		       / (1000 * 60 * 60))
		      % 24;
 
		long difference_In_Years
		    = (difference_In_Time
		       / (1000l * 60 * 60 * 24 * 365));
 
		long difference_In_Days
		    = (difference_In_Time
		       / (1000 * 60 * 60 * 24))
		      % 365;
 
		// Print the date difference in
		// years, in days, in hours, in
		// minutes, and in seconds
 
		System.out.print(
		    "Difference "
		    + "between two dates is: ");
 
		System.out.println(
		    difference_In_Years
		    + " years, "
		    + difference_In_Days
		    + " days, "
		    + difference_In_Hours
		    + " hours, "
		    + difference_In_Minutes
		    + " minutes, "
		    + difference_In_Seconds
		    + " seconds, "
		    + difference_In_Time
		    + " milliseconds");
    }
}
