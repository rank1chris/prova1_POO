package prova1;

public class Carro implements PegadaDeCarbono{
	
	/*
	 * Aqui são os atributos. São três, quilometragem, consumo, e tipoDoMotor.
	 */	
	
	private int quilometragem;
	private float consumo; 
	private String tipoDoMotor;

	/*
	 * Aqui é para o exercício 2. O valor base da emissao de carbono é 10.
	 */	
	
	private float emissaoDeCarbono = 10;

	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */	
	
	@Override
	public float calculaPegadaDeCarbono() {
		emissaoDeCarbono = emissaoDeCarbono + ((int)quilometragem/6000);//Aqui será uma unidade a cada 6 mil quilômetros rodados.
		emissaoDeCarbono = emissaoDeCarbono + ((int)consumo/3);//Aqui será uma unidade a cada 3 litros de consumo médio por 100km rodados.
		if(tipoDoMotor == "eletrico") {
		emissaoDeCarbono = emissaoDeCarbono - 1; //Subtrai em um a emissão caso tenha um motor elétrico.
		}
		return emissaoDeCarbono;
	}
	
	public Carro(int quilometragem, float consumo, String tipoDoMotor) {
		super();//Método super explicado em aula.
		this.quilometragem = quilometragem;
		this.consumo = consumo;
		this.tipoDoMotor = tipoDoMotor;
	}

	/*
	 * Aqui utilizo o @Override para garantir que sobreescrevo um método e não crio outro novo.
	 */
	
	@Override
	public String toString() {
		return "O carro que tem a quilometragem de " + quilometragem + "km, com o consumo médio de " + consumo + "l por 100km rodados, e que tem o motor" + ((tipoDoMotor != "eletrico") ? " a gasolina ou etanol " : " elétrico ") + "emite " + emissaoDeCarbono + " unidades de carbono."; //Printa certinho cada atributo. 
	}
}
