import javax.swing.JOptionPane;

public class Quest�o05 {

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a quantidade de horas trabalhadas"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor da hora trabalhada"));

		double n3 = n1 * n2;

		JOptionPane.showMessageDialog(null, "Esse aqui � o seu sal�rio: " + n3);

	}

}