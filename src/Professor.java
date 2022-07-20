import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Professor extends Funcionarios {
    private List<String> listaDeTurmas = new ArrayList<>();

    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;


    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas,
                     List<String> listaDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
        this.listaDeTurmas = listaDeTurmas;

    }

    @Override
    public int aumentarSalario() {
        return (int) (this.getSalario() * 0.1);
    }

    public void adicionarTurma(String turmaAno) {
        this.listaDeTurmas.add(turmaAno);
    }


    public List<String> getListaDeTurmas() {
        return listaDeTurmas;
    }

    private String getInformacoesListasTurmas() {
        String informacoesListasTurma = ",";
        for (String info : listaDeTurmas) {
            informacoesListasTurma = "," + info;
        }
        return informacoesListasTurma;
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

    @Override
    public String toString() {
        System.out.println("------------------------------");
        System.out.println("Informações sobre o professor: ");
        System.out.println("------------------------------");
        return "Nome do professor: " + this.getNome() +
                "\nCpf: " + this.getCpf() + "\nNúmero de registro " + this.getNumeroDeRegistro() +
                "\nOrgão de lotação: " + this.getOrgaoDeLotacao() + "\nSalário: " + this.getSalario() +
                "\nNível de graduação do professor: " + this.getNivelDeGraduacao() +
                "\nDisciplina Ministrada: " + this.getDisciplinaMinistrada() +
                "\nQuantidade de alunos: " + this.getQuantidadeDeAlunos() +
                "\nQuantidade de turmas: " + this.getQuantidadeDeTurmas() +
                "\nAumento de salário no valor de 10%: R$" + this.aumentarSalario() +
                "\nTurmas adicionadas: " + getListaDeTurmas();


    }
}
