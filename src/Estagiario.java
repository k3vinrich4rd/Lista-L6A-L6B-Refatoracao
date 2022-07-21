import java.util.List;

public class Estagiario {


    private double bolsaAuxilio;
    private double despesas;
    private String nome;

    public Estagiario(String nome,double bolsaAuxilio, double despesas) {
        this.bolsaAuxilio = bolsaAuxilio;
        this.despesas = despesas;
        this.nome = nome;
    }

    public void reembolso() {
        if (despesas < bolsaAuxilio) {
            System.out.println("Reembolso aprovado");
        } else {
            System.out.println("Reembolso reprovado, voc� ultrapassou o limite de gastos ");
        }

    }


    public void depesas() {
        double despesas = this.bolsaAuxilio;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------");
        System.out.println("Informa��es sobre o estagi�rio: ");
        System.out.println("------------------------------");
        return "Nome do estagi�rio: "  + getNome() +
                "\nValor bolsa auxilio: " + getBolsaAuxilio() +
                "\nValor das despesas: " + getDespesas();
    }
}

