package designpatternsstrategy.service;

import designpatternsstrategy.service.impl.CalculoDiaria;
import designpatternsstrategy.service.impl.CalculoMensalidade;
import designpatternsstrategy.service.impl.CalculoPorHoras;

public class ContaEstacionamento {
	
	private Double inicio;
	private Double fim;

	public static final int HORA = 1;
	public static final int DIA = 24;
	public static final int MES = 720;

	public ContaEstacionamento(Double inicio, Double fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public Double valorConta() {
		Double periodo = fim - inicio;
		Double valor = 0.0;

		if (periodo < 12 * HORA) {
			CalculoValor calculoPorHoras = new CalculoPorHoras();
			valor = calculoPorHoras.calcular(periodo);
		} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
			CalculoValor calculoDiaria = new CalculoDiaria();
			valor = calculoDiaria.calcular(periodo);
		} else {
			CalculoValor calculoMensalidade = new CalculoMensalidade();
			valor = calculoMensalidade.calcular(periodo);
		}

		return valor;
	}

}
