import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {


    private List<String> professoresSupervisionados = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, List<String> professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adiconarProfessor(){

    }


    @Override
    public int aumentarSalario() {
        return (int) (this.getSalario() * 0.05);
    }


    @Override
    public String toString() {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Informa��es sobre o coordenador(a): ");
        System.out.println("--------------------------------");
        return "Nome do coordenador: " + this.getNome() +
                "\nCpf: " + this.getCpf() + "\nN�mero de registro " + this.getNumeroDeRegistro() +
                "\nOrg�o de lota��o: " + this.getOrgaoDeLotacao() + "\nSal�rio: " + this.getSalario() +
                "\nProfessores Supervisionados " + this.getProfessoresSupervisionados() +
                "\nAumento de sal�rio no valor de 5%: R$" + aumentarSalario() + "\n";

    }

    public List<String> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<String> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessor(Professor listaDeProfessores) {
        this.professoresSupervisionados = (List<String>) listaDeProfessores;
    }
}
