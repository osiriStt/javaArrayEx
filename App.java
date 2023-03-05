
public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Try GitHub Update");

		int[] numeros = new int[] {15, 16, 8, 2, 4, 6, 2 }; 
		
		int numMayor = numeros[0];
		int numMenor = numeros[0];
		
		for (int i = 1; i< numeros.length; i++) {
			
			if ((numeros[i]>numMayor && (numeros[i]%2==0))) {
				numMayor=numeros[i];
				if (numeros[i]<numMenor && (numeros[i]%2==0)) {
					numMenor=numeros[i];
				}
			}
			System.out.println(numeros[i]);
		}
		
		System.out.println("El numero par Mayor es: "+ numMayor+ " El numero par menor es: " + numMenor);
	}
	
	
	public static boolean esPar(int numero) { //No llamar metodos en Bucles...
		return numero%2==0;
	}
	
}
