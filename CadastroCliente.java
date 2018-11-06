package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame {
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar");
	
	public CadastroCliente() {
		super("Cadastro de Cliente");
		Container pane = this.getContentPane();
		lblNome.setBounds(20, 20, 50, 25);
		pane.add(lblNome);
		txtNome.setBounds(80, 20, 280, 25);
		pane.add(txtNome);
		btnCadastrar.setBounds(650, 500, 100, 30);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Nome: " + txtNome.getText());
			}
		});
		pane.add(btnCadastrar);
		this.setLayout(null);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		CadastroCliente cad = new CadastroCliente();

	}

}
