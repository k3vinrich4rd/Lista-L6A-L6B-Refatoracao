import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Turmas turmas1 = new Turmas("9ª ano F");
        Turmas turmas2 = new Turmas("9ª ano G");
        Turmas turmas3 = new Turmas("9ª ano H");
        Turmas turmas4 = new Turmas("9ª ano I");


        Estagiario estagiario1 = new Estagiario("Guilherme", "534.665.444 - 11",
                "655.423.543 - 33", "Secretária da educação - Sp", "Bacharelado",
                "Geografia", 100, 10, 180.80, 200);
                estagiario1.adicionarTurma(turmas3.getNome());
        System.out.println(estagiario1.toString());
        estagiario1.reembolso();
        System.out.println();


        Estagiario estagiario2 = new Estagiario("Lucas", "123.656.444 - 22",
                "655.423.543 - 33", "Secretária da educação - Sp", "Bacharelado",
                "Geografia", 150, 10, 300, 200);
        estagiario2.adicionarTurma(turmas4.getNome());
        System.out.println(estagiario2.toString());
        estagiario2.reembolso();
        System.out.println();

        Professor professor1 = new Professor("Mario", "437.873.123 - 65",
                "424.398.323 - 31", "Secretária da educação - Sp", 2000,
                "Doutor em Geografia", "Geografia", 100, 5,1);

        professor1.adicionarTurma(turmas1.getNome());
        professor1.adicionarEstagiario(estagiario1.getNome());
        System.out.println(professor1.toString());
        professor1.aumentoDeSalario();
        System.out.println();


        Professor professor2 = new Professor("Norberto", "543.766.323 - 12",
                "356.783.545 - 36", "Secretária da educação - Sp", 3000,
                "Doutor em Química", "Química", 125, 4,1);

        professor2.adicionarTurma(turmas2.getNome());
        professor2.adicionarEstagiario(estagiario2.getNome());
        System.out.println(professor2.toString());
        professor2.aumentoDeSalario();
        System.out.println();


        Coordenadores coordenadores1 = new Coordenadores("Ilda", "435.434.343 - 54",
                "332.432.212 - 20", "Secretária da educação - Sp", 3000);
        coordenadores1.adiconarProfessor(professor1.getNome());
        System.out.println(coordenadores1.toString());
        coordenadores1.aumentoDeSalario();
        System.out.println();

        Coordenadores coordenadores2 = new Coordenadores("Nilza", "435.888.343 - 54",
                "986.321.500 - 44", "Secretária da educação - Sp", 3000);
        coordenadores2.adiconarProfessor(professor2.getNome());
        System.out.println(coordenadores2.toString());
        coordenadores2.aumentoDeSalario();
        System.out.println();




        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos("Gabriel",
                "462.092.442. - 11", "111.764.095 - 11", "Secretária de educação - Sp",
                3000, "Organização", "6 anos de experiência");

        System.out.println(funcionariosAdministrativos.toString());
        funcionariosAdministrativos.aumentoDeSalario();
        System.out.println();


    }

}
