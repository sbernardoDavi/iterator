import java.util.Iterator;


public class Presenca {

    public static Integer funcionariosPresentes(Dia dia) {
        int quantidade = 0;
        for (Funcionario Funcionario : dia) {
            if (Funcionario.isPresenca()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer totalFuncionariosMatriculados(Dia dia) {
        int quantidade = 0;
        for (Iterator a = dia.iterator(); ((Iterator<?>) a).hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }


}
