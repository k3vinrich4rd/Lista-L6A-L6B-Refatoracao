# Lista-L6A-L6B-Refatora��o
Refatorando um projeto desenvolvido (Aplicando o primeiro conceito de Solid)
Single - Responsibility principle (Responsabilidade �nica)

LISTA DE EXERC�CIOS 006A - Entregar: 

Lista-L6A-L6B
Trabalhando com novos conceitos de POO (Abstra��o e Interface)

LISTA DE EXERC�CIOS 006A - Entregar

Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores, coordenadores e funcion�rios administrativos. Os atributos comuns de todos os funcion�rios s�o: Nome, CPF, n�mero de registro, �rg�o de lota��o e sal�rio. Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada , quantidade de alunos e quantidade de turmas. Os coordenadores possuem os atributos: ProfessoresSupervisionados Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e Senioridade. Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos: aumentoSalario: para todos menos os coordenadores aumenta o sal�rio em 10% e para os coordenadores o aumento � de 5%. adicionaTurma: para os professores. adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados.

















Nessa vers�o faremos os seguintes ajustes.
Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores, coordenadores e funcion�rios administrativos.

O que fazer de novo:


Teremos agora estagi�rios, - esses n�o t�m sal�rios e sim bolsas.
Estagi�rios s�o vinculados a professores que t�m at� 2 - dois.
Todos os funcion�rios e estagi�rios ter�o a fun��o reembolso, despesas.
Fim!

Os atributos comuns de todos os funcion�rios s�o: nome, CPF, n�mero de registro, �rg�o de lota��o e sal�rio.
Os professores possuem os atributos: n�vel de gradua��o, disciplina ministrada, quantidade de alunos e quantidade de turmas.
Os coordenadores possuem os atributos: ProfessoresSupervisionados
Os funcion�rios administrativos possuem os atributos: fun��o Administrativa e Senioridade.
Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos:
aumentoSalario: para todos menos os coordenadores aumenta o sal�rio em 10% e para os coordenadores o aumento � de 5%.
adicionaTurma: para os professores.
adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados.

LEVEL UP
Crie uma classe turma, que se tornar� uma carater�stica dos professores por meio de composi��o.
Limite a quantidade de professores supervisionados na classe coordenador.
