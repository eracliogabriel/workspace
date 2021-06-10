import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui 1 número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui outro número: "));
		
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "Números iguais");
		}
		for (int n3 = n1+1; n3 < n2; n3++) {
			JOptionPane.showMessageDialog(null,"Os números entre: "+n1+ " e "+n2+  " são: " +n3);
		}

	}

}
