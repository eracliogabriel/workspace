import javax.swing.JOptionPane;

public class Questão05 {

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a quantidade de horas trabalhadas"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor da hora trabalhada"));

		double n3 = n1 * n2;

		JOptionPane.showMessageDialog(null, "Esse aqui é o seu salário: " + n3);

	}

}