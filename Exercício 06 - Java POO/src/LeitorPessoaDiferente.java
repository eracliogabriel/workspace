import javax.swing.JOptionPane;

public class LeitorPessoaDiferente {
	public static void main(String[] args) {
		
		PessoaDiferente P1 = new PessoaDiferente();	
		
		P1.setNome(JOptionPane.showInputDialog("Digite aqui o nome da pessoa:"));
		P1.setAltura(JOptionPane.showInputDialog("Digite aqui a altura da pessoa:"));
		P1.setDiaNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o dia do anivers�rio dessa pessoa:")));
		P1.setMesNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o m�s do anivers�rio dessa pessoa:")));
		P1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o ano do anivers�rio dessa pessoa:")));
				JOptionPane.showMessageDialog(null, P1.dados());				
	}
}