package view;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame {
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();	
	JLabel lblEnd = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();	
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField();	
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField();	
	JLabel lblCep = new JLabel("CEP: ");
	JTextField txtCep = new JTextField();
	
	public PrimeiraTela() {
		super("Cadastro");		
		Container pane = this.getContentPane();		
		pane.add(lblNome);
		lblNome.setBounds(20,20,100,20);		
		pane.add(txtNome);
		txtNome.setBounds(130,20,200,20);		
		pane.add(lblEnd);
		lblEnd.setBounds(20,45,100,20);		
		pane.add(txtEnd);
		txtEnd.setBounds(130,45,200,20);
		pane.add(lblBairro);
		lblBairro.setBounds(20,70,100,20);		
		pane.add(txtBairro);
		txtBairro.setBounds(130,70,150,20);		
		pane.add(lblCidade);
		lblCidade.setBounds(20,95,100,20);		
		pane.add(txtCidade);
		txtCidade.setBounds(130,95,150,20);
		pane.add(lblEstado);
		lblEstado.setBounds(20,120,100,20);		
		pane.add(txtEstado);
		txtEstado.setBounds(130,120,40,20);		
		pane.add(lblCep);
		lblCep.setBounds(20,145,100,20);		
		pane.add(txtCep);
		txtCep.setBounds(130,145,80,20);
		
		this.setLayout(null);
		this.setSize(400, 300);
		//this.setResizable(0);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		
		PrimeiraTela tela = new PrimeiraTela();
		
	}
}