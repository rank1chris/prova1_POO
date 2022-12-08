package prova1;

public class TestePegadaDeCarbono {
	public static void main(String[] args) {
		PegadaDeCarbono vet[] = new PegadaDeCarbono[6];
		vet[0] = new Casa(69, 40f, true);
		vet[1] = new Casa(3, 150f, false);
		vet[2] = new Carro(123000, 5f, "gasolina");
		vet[3] = new Carro(10000, 10f, "eletrico");
		vet[4] = new Pessoa("vegetariana", false, true);
		vet[5] = new Pessoa("vegana", true, false);
		int i = 0;
		while(i < vet.length) {              	//percorre o array de modo polifórmico.
			vet[i].calculaPegadaDeCarbono(); 	//usa a calculaPegadaDeCarbono() para calcular a pegada de carbono :)
			System.out.println(vet[i]);     	 //printa o cálculo
			i++;                            	 //incrementa
		}
	}
}

		
		
		
		

		
		
		
		
	
	
	
