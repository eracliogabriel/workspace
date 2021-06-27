import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class LeitorPessoaDiferente {
	public static void main(String[] args) {
		
		PessoaDiferente P1 = new PessoaDiferente();	
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		P1.setNome(JOptionPane.showInputDialog("Digite aqui o nome da pessoa:"));
		P1.setAltura(JOptionPane.showInputDialog("Digite aqui a altura da pessoa:"));
		P1.setDtNascimento(LocalDate.parse(JOptionPane.showInputDialog("Digite aqui a data de nascimento: "),dataFormatada));
//		P1.setDiaNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o dia do aniversário dessa pessoa:")));
//		P1.setMesNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o mês do aniversário dessa pessoa:")));
//		P1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o ano do aniversário dessa pessoa:")));
				JOptionPane.showMessageDialog(null, P1.dados());				
	}
}