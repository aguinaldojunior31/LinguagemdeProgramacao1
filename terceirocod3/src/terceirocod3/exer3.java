
package terceirocod3;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite as notas do aluno em LP1 neste semestre:");

	      
	        System.out.print("Nota da P1: ");
	        double p1 = scanner.nextDouble();

	        System.out.print("Nota da E1: ");
	        double e1 = scanner.nextDouble();

	        System.out.print("Nota da E2: ");
	        double e2 = scanner.nextDouble();

	        System.out.print("Nota da API: ");
	        double api = scanner.nextDouble();

	        System.out.print("Nota de X: ");
	        double x = scanner.nextDouble();

	        System.out.print("Nota da SUB: ");
	        double sub = scanner.nextDouble();

	        
	        double media = ((p1 * 0.6) + (((e1 + e2) / 2) * 0.4)) * 0.5 + (Math.max(((p1 * 0.6) + (((e1 + e2) / 2) * 0.4) - 5.9), 0) / (((p1 * 0.6) + (((e1 + e2) / 2) * 0.4)) - 5.9)) * (api * 0.5) + x + (sub * 0.2);

	        
	        System.out.println("A média do aluno em LP1 neste semestre é: " + media);

	        scanner.close();
	    }
	}


