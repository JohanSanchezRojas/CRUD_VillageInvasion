package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Vista_CrearUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	
	public Vista_CrearUsuario() {
		
		InicializarComp();
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
	}
	
	public void InicializarComp(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 156, 341, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblUsuario = new JLabel("Ingrese un Nombre de Usuario:");
		lblUsuario.setBounds(41, 30, 173, 14);
		contentPane.add(lblUsuario);
		
		lblContrasena = new JLabel("Ingrese una Contrasena:");
		lblContrasena.setBounds(41, 116, 200, 14);
		contentPane.add(lblContrasena);
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 53, 341, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(41, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(293, 227, 89, 23);
		contentPane.add(btnCancelar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JLabel getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(JLabel lblUsuario) {
		this.lblUsuario = lblUsuario;
	}

	public JLabel getLblContrasena() {
		return lblContrasena;
	}

	public void setLblContrasena(JLabel lblContrasena) {
		this.lblContrasena = lblContrasena;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}
