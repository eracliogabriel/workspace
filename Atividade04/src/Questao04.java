
import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

				String acesso = JOptionPane.showInputDialog("Digite a palavra de acesso");
				
				if(acesso.equals("Java-2021")) {
					JOptionPane.showMessageDialog(null, "Permissão: Aprovada");
				} else {
				for (int tentativas=5; tentativas >=1; tentativas--) {
						JOptionPane.showInputDialog("Tente novamente. Você tem: " +tentativas+ " tentativas");
					}
				}

			}

		}
