package com.exe;

import com.classes.Aluno;
import java.util.ArrayList;
import java.util.List;
import com.classes.Disciplinas;
import com.classes.Secretario;

import javax.swing.JOptionPane;

public class executavel {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");

		Secretario secretario = new Secretario();

		secretario.setLogin(login);
		secretario.setSenha(senha);

		if (secretario.autenticar()) {

			/* loop para a quantidades de alunos */
			
			int continuarAdicionando = 0;
			while (continuarAdicionando == 0) {
				

				/* Criando lista de alunos */
				List<Aluno> alunos = new ArrayList<Aluno>();

				/* Input das informações dos alunos */
				String nome = JOptionPane.showInputDialog("Qual é o nome do aluno");
				String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
				String ra = JOptionPane.showInputDialog("Ra do Aluno ?");
				String dataDeNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno?");
				String dataDaMatricula = JOptionPane.showInputDialog("Data da matricula do aluno: ");
				String serieDaMatricula = JOptionPane.showInputDialog("Serie do aluno");

				/* estancia para adicionar informações a lista do aluno */
				Aluno sala1 = new Aluno();

				sala1.setNome(nome);
				sala1.setIdade(Integer.valueOf(idade));
				sala1.setRa(Integer.valueOf(ra));
				sala1.setDataNascimento(Integer.valueOf(dataDeNascimento));
				sala1.setDataMatricula(Integer.valueOf(dataDaMatricula));
				sala1.setSerieMatriculado(Integer.valueOf(serieDaMatricula));

				/* loop para informar quantidade de materias e notas de cada materia. */
				for (int pos = 1; pos <= 4; pos++) {
					String nomeDisciplina = JOptionPane
							.showInputDialog("Qual é a " + pos + "º" + " disciplina do aluno?");
					String notaDisciplina = JOptionPane.showInputDialog("Qual é a nota do aluno");

					/* Adicionando disciplinas e notas de cada aluno */
					Disciplinas disciplina1 = new Disciplinas();
					disciplina1.setDisciplina(nomeDisciplina);
					disciplina1.setNota(Double.valueOf(notaDisciplina));

					sala1.getDisciplina().add(disciplina1);

				}

				alunos.add(sala1);
				
				continuarAdicionando = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alunos?");

				/* Exibindo informações dos alunos no terminal */
				System.out.println("Nome: " + sala1.getNome());
				System.out.println("Idade: " + sala1.getIdade());
				System.out.println("RA: " + sala1.getRa());
				System.out.println("Data De Nacimento: " + sala1.getDataNascimento());

				/* buscando na lista as disciplinas e notas de cada aluno */

				for (Disciplinas disc : sala1.getDisciplina()) {
					System.out.println("Disciplina: " + disc.getDisciplina());
					System.out.println("Nota: " + disc.getNota());

				}
				System.out.println("Resultado: " + sala1.getAlunoAprovado());
				System.out.println("-------------------------------------");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}

	}
}
