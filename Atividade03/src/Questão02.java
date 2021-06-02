import javax.swing.JOptionPane;

public class Questão02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para realizar SOMA"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número para realizar SOMA"));
		JOptionPane.showConfirmDialog(null, "Tem certeza dos números digitados?", "Atenção!", JOptionPane.YES_NO_OPTION);
		int n3 = n1+n2;
		JOptionPane.showMessageDialog(null, "A soma dos números Digitados é igual a: " +n3);						
	}

}
