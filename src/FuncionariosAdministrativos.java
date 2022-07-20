public class FuncionariosAdministrativos extends Funcionarios {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
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

    @Override
    public String toString() {
        System.out.println("------------------------------------------------");
        System.out.println("Informações sobre o Funcionário administrativo: ");
        System.out.println("------------------------------------------------");
        return "Nome: " + this.getNome() +
                "\nCpf: " + this.getCpf() + "\nNúmero de registro " + this.getNumeroDeRegistro() +
                "\nOrgão de lotação: " + this.getOrgaoDeLotacao() + "\nSalário: " + this.getSalario() +
                "\nFunção administrativa: " + this.getFuncaoAdministrativa() +
                "\nAumento de salário no valor de 10%: R$ " + this.aumentarSalario() +
                "\nSenioridade: " + this.getSenioridade();
    }
}
