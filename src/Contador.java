import java.util.Scanner;


public class Contador {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
       if (parametroUm > parametroDois) {
		throw new ParametrosInvalidosException();
	   }
       for(int i = parametroUm; i <= parametroDois; i++ ){
		 System.out.println("IMPRIMINDO NUMERO " + i);
	   }

		terminal.close();
	}
	
}




































































// public class Contador {
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
     
//     System.out.println("digite um numero.");
//     int numero1 = scanner.nextInt();

//     System.out.println("digite outro numero.");
//     int numero2 = scanner.nextInt();
     
    
//     static Void validar(int numero1, int numero2) throw ParametrosInvalidosException{

//     };


//         for( int i = numero1; i <= numero2; i++){
//             System.out.println("imprimindo numero "+i); 


       
    

// }}}
