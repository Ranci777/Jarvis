package Iron;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class IronMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Digite os valores separados por espaço (ex: 1 2 3 4):");

		        // Lê os valores digitados pelo usuário
		        String input = scanner.nextLine();
		        String[] valoresString = input.split(" ");
		        double[] valores = new double[valoresString.length];

		        // Converte os valores de String para double
		        for (int i = 0; i < valoresString.length; i++) {
		            valores[i] = Double.parseDouble(valoresString[i]);
		        }

		        // Realiza as análises dos valores
		        double soma = 0;
		        double maximo = Double.MIN_VALUE;
		        double minimo = Double.MAX_VALUE;

		        for (double valor : valores) {
		            soma += valor;

		            if (valor > maximo) {
		                maximo = valor;
		            }

		            if (valor < minimo) {
		                minimo = valor;
		            }
		        }

		        double media = soma / valores.length;

		        // Exibe os resultados
		        System.out.println("Resultados da análise:");
		        System.out.println("Valores informados: " + input);
		        System.out.println("Soma: " + soma);
		        System.out.println("Média: " + media);
		        System.out.println("Valor máximo: " + maximo);
		        System.out.println("Valor mínimo: " + minimo);

		        scanner.close();
		          
		        SwingUtilities.invokeLater(() -> criarGUI());
		        }

		        private static void criarGUI() {
		            JFrame frame = new JFrame("Exemplo de GUI com Botão e JTextField");
		            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            frame.setSize(300, 200);

		            // Criação do JTextField para entrada de valores
		            JTextField textField = new JTextField();
		            textField.setPreferredSize(new Dimension(200, 30));

		            // Criação do botão
		            JButton button = new JButton("Exibir Valores");

		            // Criação da área de texto para exibir os valores digitados
		            JTextArea textArea = new JTextArea();
		            textArea.setEditable(false);
		            textArea.setLineWrap(true);
		            JScrollPane scrollPane = new JScrollPane(textArea);

		            // Adiciona o ActionListener ao botão
		            button.addActionListener(new ActionListener() {
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                    String input = textField.getText();
		                    textArea.setText("Valores digitados: " + input);
		                }
		            });

		            // Criação do painel e adição dos componentes
		            JPanel panel = new JPanel();
		            panel.setLayout(new BorderLayout());
		            panel.add(textField, BorderLayout.NORTH);
		            panel.add(button, BorderLayout.CENTER);
		            panel.add(scrollPane, BorderLayout.SOUTH);

		            frame.add(panel);
		            frame.setVisible(true);
		        }
		    }
		


	}

}
