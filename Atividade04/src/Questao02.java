import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui 1 número: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui outro número: "));
		double n3 = (Math.max(n1,n2));
		
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "Números iguais");
		} else {
			JOptionPane.showMessageDialog(null, "O maior número é: "+n3);
		}
	}

}
