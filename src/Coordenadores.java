import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {


    private List<String> professoresSupervisionados = new ArrayList<>();
    private double gastos;

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, double gastos) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------");
        System.out.println("Informações sobre o coordenador: ");
        System.out.println("---------------------------------");
        return "Nome do(a) coordenador(a): " + getNome() +
                "\nCpf: " + getCpf() +
                "\nNúmero de registro: " + getNumeroDeRegistro() +
                "\nOrgão de lotação: " + getOrgaoDeLotacao() +
                "\nSalário: R$" + getSalario() +
                "\nGastos: " + getGastos() +
                "\nProfessores supervisionados: " + getProfessoresSupervisionados();

    }

    public void adiconarProfessor(String professor) {
        this.professoresSupervisionados.add(professor);
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
        double aumento = this.getSalario() * 0.05;
        System.out.println("O aumento feito em seu salário foi de 5%: R$ " + aumento);

    }

    public List<String> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<String> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
