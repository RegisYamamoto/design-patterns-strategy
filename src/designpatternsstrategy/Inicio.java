package designpatternsstrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import designpatternsstrategy.service.ContaEstacionamento;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inicio = reader.readLine();
		String fim = reader.readLine();
		
		ContaEstacionamento contaEstacionamento = new ContaEstacionamento(Double.valueOf(inicio), Double.valueOf(fim));
		Double valor = contaEstacionamento.valorConta();
		
		System.out.println("O valor a pagar é R$ " + valor + "0");
		
	}

}
