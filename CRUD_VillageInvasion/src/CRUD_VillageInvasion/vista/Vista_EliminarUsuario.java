package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_EliminarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldIntroducir;
	private JTextField textFieldMostrar;
	private JLabel lblBuscarNombre;
	private JButton btnEliminar;
	private JButton btnCancelar;
	
	
	
	public Vista_EliminarUsuario() {
		
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
		
		lblBuscarNombre = new JLabel("Introduzca el nombre del Usuario que desea eliminar:");
		lblBuscarNombre.setBounds(10, 32, 414, 14);
		contentPane.add(lblBuscarNombre);
		
		textFieldIntroducir = new JTextField();
		textFieldIntroducir.setBounds(10, 57, 414, 35);
		contentPane.add(textFieldIntroducir);
		textFieldIntroducir.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 201, 89, 23);
		contentPane.add(btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 201, 89, 23);
		contentPane.add(btnCancelar);
		
		textFieldMostrar = new JTextField();
		textFieldMostrar.setBounds(10, 103, 414, 87);
		contentPane.add(textFieldMostrar);
		textFieldMostrar.setColumns(10);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextFieldIntroducir() {
		return textFieldIntroducir;
	}

	public void setTextFieldIntroducir(JTextField textFieldIntroducir) {
		this.textFieldIntroducir = textFieldIntroducir;
	}

	public JTextField getTextFieldMostrar() {
		return textFieldMostrar;
	}

	public void setTextFieldMostrar(JTextField textFieldMostrar) {
		this.textFieldMostrar = textFieldMostrar;
	}

	public JLabel getLblBuscarNombre() {
		return lblBuscarNombre;
	}

	public void setLblBuscarNombre(JLabel lblBuscarNombre) {
		this.lblBuscarNombre = lblBuscarNombre;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}
//w
//{}
//>
//<
//*
//&&
//||
//[]
//-