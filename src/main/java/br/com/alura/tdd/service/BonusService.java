package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")).add(funcionario.getSalario());
		if (valor.compareTo(new BigDecimal("10000")) > 0) {
			// valor = BigDecimal.ZERO;
			throw new IllegalArgumentException("Funcionários com salário acima de 10.000 não podem receber bônus");
		}
		return valor;
	}

}
