package programa;

import interfaces.ICalculadora;

public class Subtracao implements ICalculadora {
	
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
		return null;
	}

	@Override
	public Float calcula(Float[] numeros) {
		return null;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double sub = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			sub -= numeros[i];
		}
		return sub;
	}

}
