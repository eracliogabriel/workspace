import javax.swing.JOptionPane;

public class Questão04 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor total da conta"));
		double n2 = 0.1;
		JOptionPane.showConfirmDialog(null, "Tem certeza do valor digitado?", "Atenção!", JOptionPane.YES_NO_OPTION);
		double n3 = n1*n2;
		JOptionPane.showMessageDialog(null, "Acréscimo dos 10% do garçom é: " +n3);						
	}

}
