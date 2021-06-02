import javax.swing.JOptionPane;

public class Questão01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para revelar números vizinhos"));
		int x1 = num -1;
		int x2 = num +1;
		JOptionPane.showConfirmDialog(null, "Tem certeza do número digitado?");
		
		JOptionPane.showMessageDialog(null, "Os vizinhos do número selecionado são: " +x1+" e "+x2);
		

	}

}
