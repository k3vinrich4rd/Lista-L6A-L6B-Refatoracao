import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Professor extends Funcionarios {
    private List<String> listaDeTurmas = new ArrayList<>();
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }


    @Override
    public int aumentarSalario() {
        this.setSalario(getSalario() * 0.1);
        return super.aumentarSalario();
    }

    public void adicionarTurma(String turmaAno) {
        this.listaDeTurmas.add(turmaAno);
    }

    public List<String> getListaDeTurmas() {
        return listaDeTurmas;
    }

    public void setListaDeTurmas(List<String> listaDeTurmas) {
        this.listaDeTurmas = listaDeTurmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
