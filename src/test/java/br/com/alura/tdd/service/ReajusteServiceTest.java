package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.time.LocalDate;


public class ReajusteServiceTest {

    @Test
    public void seOFuncionarioTiverUmDesempenhoADesejarOReajusteDeveSerDe3PorCento() {

        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("3500"));

        reajusteService.concederBonificacao(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("3605.00"), funcionario.getSalario());

    }

    @Test
    public void seOFuncionarioTiverUmDesempenhoBomOReajusteDeveSerDe15PorCento() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("3500"));

        reajusteService.concederBonificacao(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("4025.00"), funcionario.getSalario());
    }

    @Test
    public void seOFuncionarioTiverUmDesempenhoÓtimoOReajusteDeveSerDe20PorCento() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("3500"));

        reajusteService.concederBonificacao(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("4200.00"), funcionario.getSalario());
    }


}
