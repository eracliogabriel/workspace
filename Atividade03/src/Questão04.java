import javax.swing.JOptionPane;

public class Quest�o04 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor total da conta"));
		double n2 = 0.1;
		JOptionPane.showConfirmDialog(null, "Tem certeza do valor digitado?", "Aten��o!", JOptionPane.YES_NO_OPTION);
		double n3 = n1*n2;
		JOptionPane.showMessageDialog(null, "Acr�scimo dos 10% do gar�om �: " +n3);						
	}

}
