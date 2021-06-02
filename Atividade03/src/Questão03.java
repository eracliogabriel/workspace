import javax.swing.JOptionPane;

public class Questão03 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a primeira nota"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a segunda nota"));
		JOptionPane.showConfirmDialog(null, "Tem certeza dos valores digitados?", "Atenção!", JOptionPane.YES_NO_OPTION);
		
		double n3 = (n1+n2)/2;
		JOptionPane.showMessageDialog(null, "A Media de nota do aluno é: " +n3 );
	}

}
