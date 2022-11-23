package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {


    @Test
    public void deveRetornarUmaExcecaoQuandoOSalarioDoFuncionarioForMaiorQue10Mil() {
        BonusService service = new BonusService();
        Assert.assertThrows(IllegalArgumentException.class ,()-> service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("12000"))));
    }

}