import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui 1 n�mero: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui outro n�mero: "));
		double n3 = (Math.max(n1,n2));
		
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "N�meros iguais");
		} else {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n3);
		}
	}

}
