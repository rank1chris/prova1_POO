package prova1;

public class Pessoa implements PegadaDeCarbono{
	
	/*
	 * Aqui são os atributos. São três, dietas, seCompraDeProdutosLocais, e seRecicla.
	 */
		
	private String dietas; 
	private boolean seCompraDeProdutosLocais; 
	private boolean seRecicla;
	
	/*
	 * Aqui é para o exercício 2. O valor base da emissao de carbono é 5.
	 */
	
	private float emissaoDeCarbono = 5;

	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */	
	
	@Override
	public float calculaPegadaDeCarbono() {
		//parte das dietas
		if(dietas != "vegetariana") {
			emissaoDeCarbono = emissaoDeCarbono + 2; //caso a dietas não for vegetariana, ela adiciona duas unidades de carbono.
		}
		//parte dos hábitos
		if(seCompraDeProdutosLocais) {
			emissaoDeCarbono = emissaoDeCarbono - 1; //caso comprar produtos em lojas locais, ela remove uma unidade de carbono.
		}
		if(seRecicla) {
			emissaoDeCarbono = emissaoDeCarbono - 1; //caso reciclar, ela remove uma unidade de carbono.
		}
		return emissaoDeCarbono;
	} 
	
	public Pessoa(String dietas, boolean fornecedores, boolean seRecicla) {
		super();//Método super explicado em aula
		this.dietas = dietas;
		this.seCompraDeProdutosLocais = fornecedores;
		this.seRecicla = seRecicla;
	}
	
	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */	
	
	@Override
	public String toString() {
		return "Essa pessoa" + ((dietas != "vegetariana") ? " não segue " : " segue ") + "uma dieta vegetariana," + ((seCompraDeProdutosLocais != true) ? " não compra produtos locais " : " compra produtos locais ") + "e" + ((seRecicla != true) ? " não recicla" : " recicla") + ". Assim, ela emite " + emissaoDeCarbono + " unidades de carbono."; //Printa certinho cada atributo. 
	}
}
