  import javax.swing.JOptionPane;

public class LeitorPessoa {

	public static void main(String[] args) {
		
		Pessoa myObj = new Pessoa();
		JOptionPane.showMessageDialog(null, "*** DADOS PESSOAIS ***" + myObj.dados());
	}

}