import javax.swing.JOptionPane;

public class Quest�o01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para revelar n�meros vizinhos"));
		int x1 = num -1;
		int x2 = num +1;
		JOptionPane.showConfirmDialog(null, "Tem certeza do n�mero digitado?");
		
		JOptionPane.showMessageDialog(null, "Os vizinhos do n�mero selecionado s�o: " +x1+" e "+x2);
		

	}

}
