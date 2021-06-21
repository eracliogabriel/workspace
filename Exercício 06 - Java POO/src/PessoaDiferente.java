import java.time.LocalDate;

public class PessoaDiferente {
	private String nome;
	private String altura;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	public String dados(){
		return "*** DADOS PESSOAIS ***" 
			 + "\n" + "Nome: " + getNome()
			 + "\n" + "Data de Nascimento: " +getDiaNascimento()+"/"+getMesNascimento()+"/"+getAnoNascimento()
			 + "\n" + "Idade: " + idade()
			 + "\n" + "Altura: " + getAltura()+"m";
	}
	public int idade() {
		LocalDate dataatual = LocalDate.now();
		int anoatual = dataatual.getYear();
		int idade = anoatual - getAnoNascimento();
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
}