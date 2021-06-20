import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pessoa {
	private String nome = "Gabriel";
	private String altura = "1.75m";
	private LocalDate dtNascimento = LocalDate.of(1996, 8, 18);
	private String dados = ("\nNome: " +getNome() + "\nData de Nascimento: "+getDataFormatada()  + "\nIdade: " +Idade() + "\nAltura: "+getAltura());
 		
	public int Idade() {
		LocalDate atual = LocalDate.now();
		return atual.getYear() - dtNascimento.getYear();	
	}
	
	public String getDataFormatada() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    return getDtNascimento().format(formato);
	}
	public String dados() {
		return dados;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	

}