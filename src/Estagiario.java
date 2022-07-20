import java.util.List;

public class Estagiario extends Professor {
    private double bolsaAuxilio;
    private double despesas;

    public Estagiario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas, List<String> listaDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario, nivelDeGraduacao, disciplinaMinistrada, quantidadeDeAlunos, quantidadeDeTurmas, listaDeTurmas);
    }

    public void reembolso(){
        if (despesas < 100){
            System.out.println("Solicitação de reembolso aprovada");
        }else {
            System.out.println("Solicitação de reeembolso reprovada");
        }
    }
    public void despesas(){
        double valorDespesas = this.bolsaAuxilio;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
}

