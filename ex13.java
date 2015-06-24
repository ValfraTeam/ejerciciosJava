import java.util.*;
public class ex13{
	public static void main(String[]args){
		Scanner leer = new Scanner (System.in);
		int n=0;
		int suma=0;
		int i=0;
		
		while(n<=500){
			try{
				System.out.println("ingrese numero: ");
				n=leer.nextInt();
				
				for(i=n; i<=500; i=i+8){
				suma+=i;
				System.out.println("es :"+i);}
				n=600;
				}
				catch(Exception e){
					System.out.println("ingrese un numero menor a 500.. ");
					n=0;
				}
		
	
		}
		System.out.println("  suma:"+suma);
		
		
	}
}
 

