import java.time.LocalDate;

//import javax.swing.JOptionPane;

public class Pessoa {
	private String nome = "Gabriel";
	private String altura = "1.75m";
	private String dtNascimento = "18/08/1996";
	String dados = ("\nNome: " +getNome() + "\nData de Nascimento: "+getDtNascimento()  + "\nAltura: " +getAltura());

	LocalDate atual = LocalDate.now();
		
	public String dados() {
		return dados;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

//	public static void main(String[] args) {
//
//		Pessoa myObj = new Pessoa();
//		JOptionPane.showMessageDialog(null, "*** DADOS PESSOAIS ***" + myObj.dados());
//	 }

}