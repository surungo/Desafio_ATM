public class Main {
	public static void main(String[] args) {
		int[] notas ={2,5,10,20,50,100,200};
		T.imprimirNotas(notas);
		int valor = T.escolherValor();
		T.printValor(String.valueOf(valor));
		int[] qtNotas = T.calcularQtNotas(notas,valor);
		T.imprimirQtNotas(notas,qtNotas);
	}
}
class T{
  public static void imprimirQtNotas(int[] pnotas,int[] pQtNotas){
    System.out.println("Notas sacadas");
    for(int i=0;i<pnotas.length;i++){
		  System.out.println(pQtNotas[i]+" notas "+pnotas[i]);
		}
  }
  public static void imprimirQtNotas(int[] pQtNotas){
  }
  public static int[] calcularQtNotas(int[] pNotas, int pValor){
    int[] vQtNotas ={0,0,0,0,0,0,5};
    return vQtNotas;
  }
  public static void printValor(String text){
    System.out.println("Valor de saque");
    System.out.println(text);
  }
  public static int escolherValor(){
    int vvalor = 1000;
    return vvalor;
    }
  public static void imprimirNotas(int[] pnotas){
    System.out.println("Notas disponiveis");
    for(int i=0;i<pnotas.length;i++){
		  System.out.println("notas "+pnotas[i]);
		}
  }
  }
