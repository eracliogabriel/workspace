import javax.swing.JOptionPane;

public class Pessoa {
	private String nome = "Gabriel";
	private String dtNascimento = "18-08-1996";
	private String altura = "1.75m";
	String dados = ("\nNome: " +nome + "\nData de Nascimento: "+dtNascimento + "\nAltura: " +altura);


	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}

	public static void main(String[] args) {

		Pessoa myObj = new Pessoa();
		JOptionPane.showMessageDialog(null, "*** DADOS PESSOAIS ***" + myObj.dados);
	
	 }

}