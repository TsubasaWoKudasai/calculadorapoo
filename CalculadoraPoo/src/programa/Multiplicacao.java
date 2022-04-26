package programa;

import interfaces.ICalculadora;

public class Multiplicacao implements ICalculadora{

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
		Integer mult = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float mult = 1F;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double mult = 1D;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

}