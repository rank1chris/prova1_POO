package prova1;

public class Casa implements PegadaDeCarbono{
	
	/*
	 * Aqui são os atributos. São três, numeroDeMoradores, consumoDeEnergiaEletrica, e painelSolar.
	 */
	
	private int numeroDeMoradores;
	private float consumoDeEnergiaEletrica;
	private boolean painelSolar;
	
	/*
	 * Aqui é para o exercício 2. O valor base da emissao de carbono é 7.
	 */
	
	private float emissaoDeCarbono = 7;
	
	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */
	
	@Override
	public float calculaPegadaDeCarbono() {
		emissaoDeCarbono = emissaoDeCarbono + numeroDeMoradores; //Como aqui cada morador equivale a uma unidade, é só somar com a emissão.
		consumoDeEnergiaEletrica = consumoDeEnergiaEletrica + ((int)consumoDeEnergiaEletrica/80); //Aqui cada consumo de energia elétrica conta como uma unidade a cada kilowatts hora, então é só dividir por oitenta.
		emissaoDeCarbono = emissaoDeCarbono + consumoDeEnergiaEletrica; //Soma de ambas as unidades de emissão de carbono com o consumo de energia elétrica.
		if(painelSolar) {
			emissaoDeCarbono = emissaoDeCarbono - 1; //Caso houver um painel solar, a emissão cai por uma unidade.
		}
		return emissaoDeCarbono;
	}
	
	public Casa(int numeroDeMoradores, float consumoDeEnergiaEletrica, boolean painelSolar) {
		super();//Método super explicado em aula
		this.numeroDeMoradores = numeroDeMoradores;
		this.consumoDeEnergiaEletrica = consumoDeEnergiaEletrica;
		this.painelSolar = painelSolar;
	}
	
	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */	
	
	@Override
	public String toString() {
		return "A Casa que tem o numero de moradores de " + numeroDeMoradores + ", com o consumo de energia eletrica de " + consumoDeEnergiaEletrica + ", e que " + ((painelSolar == true) ? "tem " : "não tem ") + "painel solar emite " + emissaoDeCarbono + " de carbono."; //Printa certinho cada atributo. 
	}
}
