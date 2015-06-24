import java.util.Scanner;
public class ex12{
	public static void main(String[] args) {
		int n=0;
		int mult=0;
		int cont=0;
		int suma=0;
		int t=0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		t=leer.nextInt();
		while(n<t){
			n++;
			if(n%10==0){
				cont++;
				mult=n;
				suma+=n;
				System.out.println("multiplo de 10 es: "+mult);

			}
		}
		System.out.println("la cantidad de multiplos de 10 son: "+cont);
		System.out.println("la SUMA DE multiplos de 10: "+suma);
		
	}
}