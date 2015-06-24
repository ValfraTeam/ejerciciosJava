/**Hacer un algoritmo que calcule la suma de 
los números impares comprendidos entre el 0 y 100*/
public class ex9{
	public static void main(String[] args) {
		int n=0;
		
		int suma=0;

		while(n<100){
			n++;
			if(n%2!=0){
				suma+=n;
				
				

			}
		}
		System.out.println("la suma de los impares : "+suma);
		
	}
}