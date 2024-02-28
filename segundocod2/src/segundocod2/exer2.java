package segundocod2;

public class exer2 {

	public static void main(String[] args) {
		
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

       
        int despesaTotal = janeiro + fevereiro + marco;

       
        int mediaMensal = despesaTotal / 3;

      
        System.out.println("Despesa total no trimestre: R$" + despesaTotal);
        System.out.println("Média mensal de gastos: R$" + mediaMensal);

	}

}
