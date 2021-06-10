import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		
		String aluno = JOptionPane.showInputDialog("Digite aqui o nome completo do Aluno: ");		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a nota final do Aluno: "));
		
		double resultado = nota;
		
		if (resultado >=7) {
		JOptionPane.showMessageDialog(null, "**Resultado**" + "\nO Aluno: "+aluno +" está Aprovado" +" com a nota: "+nota);
		} else if (resultado >= 4 && resultado <= 7) {
		JOptionPane.showMessageDialog(null, "**Resultado**" + "\nO Aluno: "+aluno +" está em Recuperação" +" com a nota: "+nota);	
		} else {
		JOptionPane.showMessageDialog(null, "**Resultado**" + "\nO Aluno: "+aluno +" está Reprovado" +" com a nota: "+nota); 
		}
	}

}

