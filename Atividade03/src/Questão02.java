import javax.swing.JOptionPane;

public class Quest�o02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero para realizar SOMA"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro n�mero para realizar SOMA"));
		JOptionPane.showConfirmDialog(null, "Tem certeza dos n�meros digitados?", "Aten��o!", JOptionPane.YES_NO_OPTION);
		int n3 = n1+n2;
		JOptionPane.showMessageDialog(null, "A soma dos n�meros Digitados � igual a: " +n3);						
	}

}
