package designpatternsstrategy.service.impl;

import designpatternsstrategy.service.CalculoValor;

public class CalculoPorHoras implements CalculoValor {
	
	public static final int HORA = 1;
	
	Double valorConta;
	
	@Override
	public Double calcular(Double periodo) {
		return 2.0 * Math.ceil(periodo / HORA);
	}

}
