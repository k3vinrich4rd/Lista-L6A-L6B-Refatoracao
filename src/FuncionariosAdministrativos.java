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
        return "Nome do professor: " + this.getNome() +
                "\nCpf: " + this.getCpf() + "\nN�mero de registro " + this.getNumeroDeRegistro() +
                "\nOrg�o de lota��o: " + this.getOrgaoDeLotacao() + "\nSal�rio: " + this.getSalario() +
                "\nFun��o administrativa: " + this.getFuncaoAdministrativa() +
                "\nSenioridade: " + this.getFuncaoAdministrativa();
    }
}
