package controller;
import javax.swing.JOptionPane;
import model.aluno;

public class adicionaralunos {
    aluno alunos = new aluno();
    
	public void adicionaraluno() {
		alunos.setNome(JOptionPane.showInputDialog("Nome: "));
		alunos.setRa(Integer.parseInt(JOptionPane.showInputDialog("RA: ")));
		alunos.setTurma(JOptionPane.showInputDialog("Turma: "));
	}
	public String dadosalunos() {
		StringBuffer dados = new StringBuffer();
		dados.append("\n Nome: " + alunos.getNome());
		dados.append("\n RA: " + alunos.getRa());
		dados.append("\n Turma: " + alunos.getTurma());
		return dados.toString();
	}
	
	
}
