package programa;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora {

	@Override
	public Integer calcula(Integer n1, Integer n2) {
			return null;
		}

	@Override
	public Float calcula(Float n1, Float n2) {
			return null;

		}

	@Override
	public Double calcula(Double n1, Double n2) { 
			return null;

		}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) { 
		Double divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
		}
		return divisao;
	}
}