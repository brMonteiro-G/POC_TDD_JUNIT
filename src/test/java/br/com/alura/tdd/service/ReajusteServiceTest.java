package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.time.LocalDate;


public class ReajusteServiceTest {

    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializaVariaveis(){
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("3500"));
    }

    @Test
    public void seOFuncionarioTiverUmDesempenhoADesejarOReajusteDeveSerDe3PorCento() {

        reajusteService.concederBonificacao(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("3605.00"), funcionario.getSalario());

    }

    @Test
    public void seOFuncionarioTiverUmDesempenhoBomOReajusteDeveSerDe15PorCento() {

        reajusteService.concederBonificacao(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("4025.00"), funcionario.getSalario());
    }

    @Test
    public void seOFuncionarioTiverUmDesempenhoÓtimoOReajusteDeveSerDe20PorCento() {

        reajusteService.concederBonificacao(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("4200.00"), funcionario.getSalario());
    }


}
