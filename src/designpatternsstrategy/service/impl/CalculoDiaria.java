package designpatternsstrategy.service.impl;

import designpatternsstrategy.service.CalculoValor;

public class CalculoDiaria implements CalculoValor {
	
	public static final int DIA = 24;
	
	Double valorConta;

	@Override
	public Double calcular(Double periodo) {
		return 26.0 * Math.ceil(periodo / DIA);
	}

}
