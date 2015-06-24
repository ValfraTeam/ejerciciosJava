import java.util.Scanner;
public class ex7{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int n=0;
		int x=0;
		
		
		
			try{
				System.out.println("Ingrese un numero: ");
				n=leer.nextInt();
					
				while(x<n){
					x++;
					System.out.println("el numero es: "+x);
					op=2;

				} 
			}
			catch (Exception e){
				System.out.println("El Valor no es un entero..");
				
			}
		
		
	}
}
			
			
		
		


		

	

