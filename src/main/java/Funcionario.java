public class Funcionario {
    private String nome;
    private boolean presenca;

    public Funcionario(String nome, boolean presenca) {
        this.nome = nome;
        this.presenca = presenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
}
