package CRUD_VillageInvasion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Vista_InsertarUsuario extends JDialog {
	private JTextField tfNombre;
	private JTextField tfContrasena;
	private JButton btnAceptar;
	private JButton btnCancelar;

	public Vista_InsertarUsuario(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Insertar usuario");
		setSize(424, 250);
		setResizable(false);
		setLocationRelativeTo(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre de usuario:");
		lblNombre.setBounds(83, 20, 218, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblContrasena = new JLabel("Ingrese la contrasena:");
		lblContrasena.setBounds(83, 83, 218, 14);
		getContentPane().add(lblContrasena);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(83, 39, 218, 33);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfContrasena = new JTextField();
		tfContrasena.setBounds(83, 101, 218, 33);
		getContentPane().add(tfContrasena);
		tfContrasena.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(83, 163, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(212, 163, 89, 23);
		getContentPane().add(btnCancelar);
	}

	public JTextField getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(JTextField tfNombre) {
		this.tfNombre = tfNombre;
	}

	public JTextField getTfContrasena() {
		return tfContrasena;
	}

	public void setTfContrasena(JTextField tfContrasena) {
		this.tfContrasena = tfContrasena;
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
	
	public void borrarTF() {
		tfNombre.setText("");
		tfContrasena.setText("");
	}
}