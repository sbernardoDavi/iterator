import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PresencaTest {

    @Test
    public void deveContarFuncionariosPresentesDia(){
        Dia dia = new Dia(
                new Funcionario("Davi", true),
                new Funcionario("Joao", true),
                new Funcionario("Marco", false)
        );
        assertEquals(2, Presenca.funcionariosPresentes(dia));
    }

    @Test
    public void deveContarTotalFuncionariosMatriculados() {
        Dia dia = new Dia(
                new Funcionario("Davi", true),
                new Funcionario("Pedro", true),
                new Funcionario("Marco", false),
                new Funcionario("Ana", true),
                new Funcionario("Caio", true)

        );
        assertEquals(5, Presenca.totalFuncionariosMatriculados(dia));
    }

}