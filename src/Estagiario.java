import java.util.ArrayList;
import java.util.List;

public class Estagiario {
    private String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;

    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private double bolsaAuxilio;

    private List<String> listaDeTurmas = new ArrayList<>();

    private double gastos;

    public Estagiario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas, double bolsaAuxilio, double gastos) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
        this.bolsaAuxilio = bolsaAuxilio;
        this.gastos = gastos;
    }


    @Override
    public String toString() {
        System.out.println("---------------------------------");
        System.out.println("Informações sobre o Estagiário: ");
        System.out.println("---------------------------------");
        return "Nome do(a) Estagiário(a): " + this.getNome() +
                "\nCpf: " + this.getCpf() +
                "\nNúmero de registro: " + this.getNumeroDeRegistro() +
                "\nOrgão de lotação: " + this.getOrgaoDeLotacao() +
                "\nNível de graduação: " + this.getNivelDeGraduacao() +
                "\nDisciplina Ministrada: " + this.getDisciplinaMinistrada() +
                "\nQuantidade de alunos: " + this.getQuantidadeDeAlunos() +
                "\nQuantidade de turmas: " + this.getQuantidadeDeTurmas() +
                "\nTurmas adicionadas: " + getListaDeTurmas() +
                "\nValor da bolsa auxilio: R$ " + getBolsaAuxilio() +
                "\nValor de suas despesas: R$" + getGastos();
    }

    public void adicionarTurma(String turmas) {
        this.listaDeTurmas.add(turmas);
    }
    public void reembolso(){
        if(getGastos() < getBolsaAuxilio()){
            System.out.println();
            System.out.println("O seu reembolso foi aprovado");
        }else {
            System.out.println();
            System.out.println("O seu reembolso foi reprovado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
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

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public List<String> getListaDeTurmas() {
        return listaDeTurmas;
    }

    public void setListaDeTurmas(List<String> listaDeTurmas) {
        this.listaDeTurmas = listaDeTurmas;
    }
}

