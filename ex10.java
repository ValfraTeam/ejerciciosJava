public class ex10{
	public static void main(String[] args) {
		int n=0;
		int mult=0;
		int cont=0;

		while(n<100){
			n++;
			if(n%5==0){
				cont++;
				mult=n;
				System.out.println("multiplo de 5 es: "+mult);

			}
		}
		System.out.println("la cantidad de multiplos de 5 son: "+cont);
		
	}
}