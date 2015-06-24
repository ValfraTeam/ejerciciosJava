import java.util.*;
public class ex14{
	public static void main(String[]args){
		
		int n=0;
		int suma=0;
		int i=0;
		while(n<=100){
			if(n%2==0){
				i=n*n;
				suma+=i;
			}
		}
	System.out.println("la suma de los cuadrados pares es: "+suma);
	}
}