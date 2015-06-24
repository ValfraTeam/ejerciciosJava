/**Hacer un algoritmo que imprima y
 cuente los múltiplos de 3 que hay entre 1 y 100*/
public class ex8{
	public static void main(String[] args) {
		int n=0;
		int mult=0;
		int cont=0;

		while(n<100){
			n++;
			if(n%3==0){
				cont++;
				mult=n;
				System.out.println("multiplo de 3 es: "+mult);

			}
		}
		System.out.println("la cantidad de multiplos de 3 son: "+cont);
		
	}
}