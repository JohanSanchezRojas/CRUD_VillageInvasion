package CRUD_VillageInvasion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Vista_CambiarContrasena extends JDialog {
	private JLabel lblInformacionUsuario;
	private JTextField tfContrasenaAnterior;
	private JTextField tfContrasenaNueva;
	private JButton btnCambiarContrasena;
	private JButton btnCancelar;
	
	public Vista_CambiarContrasena(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Cambiar contrasena");
		setSize(488, 349);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		lblInformacionUsuario = new JLabel();
		lblInformacionUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacionUsuario.setText("INFORMACION USUARIO");
		lblInformacionUsuario.setBounds(10, 11, 452, 45);
		getContentPane().add(lblInformacionUsuario);
		
		tfContrasenaAnterior = new JTextField();
		tfContrasenaAnterior.setBounds(124, 77, 221, 45);
		getContentPane().add(tfContrasenaAnterior);
		tfContrasenaAnterior.setColumns(10);
		
		JLabel lblTitulo0 = new JLabel("Digite la contrasena del usuario");
		lblTitulo0.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo0.setBounds(10, 56, 452, 14);
		getContentPane().add(lblTitulo0);
		
		JLabel lblTitulo1 = new JLabel("Digite la nueva contrasena");
		lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo1.setBounds(10, 142, 452, 14);
		getContentPane().add(lblTitulo1);
		
		tfContrasenaNueva = new JTextField();
		tfContrasenaNueva.setColumns(10);
		tfContrasenaNueva.setBounds(124, 167, 221, 45);
		getContentPane().add(tfContrasenaNueva);
		
		btnCambiarContrasena = new JButton("Cambiar contrasena");
		btnCambiarContrasena.setBounds(90, 247, 129, 23);
		getContentPane().add(btnCambiarContrasena);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(304, 247, 89, 23);
		getContentPane().add(btnCancelar);
	}

	public JLabel getLblInformacionUsuario() {
		return lblInformacionUsuario;
	}

	public void setLblInformacionUsuario(JLabel lblInformacionUsuario) {
		this.lblInformacionUsuario = lblInformacionUsuario;
	}

	public JTextField getTfContrasenaAnterior() {
		return tfContrasenaAnterior;
	}

	public void setTfContrasenaAnterior(JTextField tfContrasenaAnterior) {
		this.tfContrasenaAnterior = tfContrasenaAnterior;
	}

	public JTextField getTfContrasenaNueva() {
		return tfContrasenaNueva;
	}

	public void setTfContrasenaNueva(JTextField tfContrasenaNueva) {
		this.tfContrasenaNueva = tfContrasenaNueva;
	}

	public JButton getBtnCambiarContrasena() {
		return btnCambiarContrasena;
	}

	public void setBtnCambiarContrasena(JButton btnCambiarContrasena) {
		this.btnCambiarContrasena = btnCambiarContrasena;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}