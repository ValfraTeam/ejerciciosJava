public class ex5{
	public static void main(String[]args){
		int cuentaI=0;
		System.out.println("los impares ");
		for (int j=0; j<=100;j++){
			if(j%2!=0){
			System.out.println(j);
			cuentaI+=1;
			}
		}
	System.out.println("la cantidad de impares es: "+cuentaI);
	}
}