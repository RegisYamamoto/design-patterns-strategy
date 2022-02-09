package designpatternsstrategy.service.impl;

import designpatternsstrategy.service.CalculoValor;

public class CalculoMensalidade implements CalculoValor {

	public static final int MES = 720;
	
	Double valorConta;

	@Override
	public Double calcular(Double periodo) {
		return 300.0 * Math.ceil(periodo / MES);
	}
	
}
