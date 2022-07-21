import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {


    private List<String> professoresSupervisionados = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
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
                "\nSalário antes do aumento: R$" + getSalario() +
                "\nProfessores supervisionados: " + getProfessoresSupervisionados();

    }

    public void adiconarProfessor(String professor) {
        this.professoresSupervisionados.add(professor);
    }

    @Override
    public void reembolsoDespesas() {

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


}
