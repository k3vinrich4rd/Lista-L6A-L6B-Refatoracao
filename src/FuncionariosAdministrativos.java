public class FuncionariosAdministrativos extends Funcionarios {
    private String funcaoAdministrativa;
    private String senioridade;
    private double gastos;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade, double gastos) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------------------------");
        System.out.println("Informa��es sobre o Funcion�rio(a) Administrativo: ");
        System.out.println("---------------------------------------------------");
        return "Nome do Funcion�rio(a): " + this.getNome() +
                "\nCpf: " + this.getCpf() +
                "\nN�mero de registro: " + this.getNumeroDeRegistro() +
                "\nOrg�o de lota��o: " + this.getOrgaoDeLotacao() +
                "\nSal�rio: " + this.getSalario() +
                "\nGastos: " + getGastos() +
                "\nFun��o Administrativa: " + this.getFuncaoAdministrativa() +
                "\nSenioridade: " + this.getSenioridade();

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
        System.out.println("O aumento feito em seu sal�rio foi de 10% : R$ " + aumento);

    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
