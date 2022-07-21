public class FuncionariosAdministrativos extends Funcionarios {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------------------------");
        System.out.println("Informações sobre o Funcionário(a) Administrativo: ");
        System.out.println("---------------------------------------------------");
        return "Nome do Funcionário(a): " + this.getNome() +
                "\nCpf: " + this.getCpf() +
                "\nNúmero de registro: " + this.getNumeroDeRegistro() +
                "\nOrgão de lotação: " + this.getOrgaoDeLotacao() +
                "\nSalário: " + this.getSalario() +
                "\nFunção Administrativa: " + this.getFuncaoAdministrativa() +
                "\nSenioridade: " + this.getSenioridade();

    }

    @Override
    public void reembolsoDespesas() {

    }

    @Override
    public void aumentoDeSalario() {
        System.out.println();
        double aumento = this.getSalario() * 0.1;
        System.out.println("O aumento feito em seu salário foi de 10% : R$ " + aumento);

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


}
