import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> turmas = new ArrayList<>();
        turmas.add("Turma F");
        turmas.add("Turma G");


        Professor professor = new Professor("Norberto", "333.333.333 - 33",
                "333.333.333 - 33", "Secretária da educação - Sp", 2000,
                "Mestre em química", "Química", 125, 5, turmas);
        professor.adicionarTurma("Turma H");
        System.out.println(professor.toString());
        // Problema Resolvido.

        List<String> professores = new ArrayList<>();
        professores.add(professor.getNome());
        professores.add("Joyce");

        Coordenadores coordenadores = new Coordenadores("Ilda", "435.434.343 - 54",
                "333.333.333 - 33", "Secretária da educação - Sp", 3000,
                professores);


        System.out.println(coordenadores.toString());
        // Problema: não estou conseguindo adicionar professores


        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos("Gabriel",
                "222.222.222. - 22", "111.111.111 - 11", "Secretária de educação - Sp",
                3000, "Organização", "6 anos de experiência");
        System.out.println(funcionariosAdministrativos.toString());


    }

}
