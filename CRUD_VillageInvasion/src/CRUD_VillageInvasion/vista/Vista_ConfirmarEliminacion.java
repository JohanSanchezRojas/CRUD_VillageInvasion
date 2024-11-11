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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Vista_ConfirmarEliminacion extends JDialog {
	private JLabel lblInformacionUsuario;
	private JButton btnEliminarUsuario;
	private JButton btnCancelar;
	
	public Vista_ConfirmarEliminacion(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Confirmar eliminacion");
		setSize(323, 203);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		lblInformacionUsuario = new JLabel("INFORMACION USUARIO");
		lblInformacionUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacionUsuario.setBounds(10, 11, 287, 28);
		getContentPane().add(lblInformacionUsuario);
		
		JLabel lblTitulo = new JLabel("¿Seguro que desea eliminar al usuario?");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 53, 287, 14);
		getContentPane().add(lblTitulo);
		
		btnEliminarUsuario = new JButton("Eliminar usuario");
		btnEliminarUsuario.setBounds(23, 101, 107, 23);
		getContentPane().add(btnEliminarUsuario);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(187, 101, 89, 23);
		getContentPane().add(btnCancelar);
	}

	public JLabel getLblInformacionUsuario() {
		return lblInformacionUsuario;
	}

	public void setLblInformacionUsuario(JLabel lblInformacionUsuario) {
		this.lblInformacionUsuario = lblInformacionUsuario;
	}

	public JButton getBtnEliminarUsuario() {
		return btnEliminarUsuario;
	}

	public void setBtnEliminarUsuario(JButton btnEliminarUsuario) {
		this.btnEliminarUsuario = btnEliminarUsuario;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	
}
