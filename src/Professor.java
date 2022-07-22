import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Professor extends Funcionarios {
    private List<String> listaDeTurmas = new ArrayList<String>();
    private List<String> listaDeEstagiarios = new ArrayList<String>();
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private int quantidadeDeEstagiarios;
    private double gastos;

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas, int quantidadeDeEstagiarios, double gastos) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.gastos = gastos;

    }

    @Override
    public String toString() {
        System.out.println("--------------------------------");
        System.out.println("Informações sobre o professor: ");
        System.out.println("--------------------------------");
        return "Nome do(a) professor(a): " + this.getNome() +
                "\nCpf: " + this.getCpf() +
                "\nNúmero de registro: " + this.getNumeroDeRegistro() +
                "\nOrgão de lotação: " + this.getOrgaoDeLotacao() +
                "\nSalário: R$ " + this.getSalario() +
                "\nGastos: " + getGastos() +
                "\nNível de graduação: " + this.getNivelDeGraduacao() +
                "\nDisciplina Ministrada: " + this.getDisciplinaMinistrada() +
                "\nQuantidade de alunos: " + this.getQuantidadeDeAlunos() +
                "\nQuantidade de turmas: " + this.getQuantidadeDeTurmas() +
                "\nTurmas adicionadas: " + getListaDeTurmas() +
                "\nEstagiários supervisionados: " + getListaDeEstagiarios();


    }


    public void adicionarEstagiario(String estagiario) {
        this.listaDeEstagiarios.add(estagiario);
        this.setQuantidadeDeEstagiarios(this.getQuantidadeDeEstagiarios() + 1);
    }

    public void adicionarTurma(String turmas) {
        this.listaDeTurmas.add(turmas);
        this.setQuantidadeDeTurmas(this.getQuantidadeDeTurmas() + 1);
    }

    @Override
    public void reembolsoDespesas() {
        if(getGastos() < getSalario()){
            System.out.println("O seu reembolso foi aprovado");
        }else {
            System.out.println("O seu reembolso foi reprovado");
        }
    }

    @Override
    public void aumentoDeSalario() {
        System.out.println();
        double aumento = this.getSalario() * 0.1;
        System.out.println("O aumento feito em seu salário foi de 10% : R$ " + aumento);

    }

    public List<String> getListaDeTurmas() {
        return listaDeTurmas;
    }

    public void setListaDeTurmas(List<String> listaDeTurmas) {
        this.listaDeTurmas = listaDeTurmas;
    }

    public List<String> getListaDeEstagiarios() {
        return listaDeEstagiarios;
    }

    public void setListaDeEstagiarios(List<String> listaDeEstagiarios) {
        this.listaDeEstagiarios = listaDeEstagiarios;
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

    public int getQuantidadeDeEstagiarios() {
        return quantidadeDeEstagiarios;
    }

    public void setQuantidadeDeEstagiarios(int quantidadeDeEstagiarios) {
        this.quantidadeDeEstagiarios = quantidadeDeEstagiarios;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}

