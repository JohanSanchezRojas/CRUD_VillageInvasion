package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_MenuJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCreate;
	private JButton btnRead;
	private JButton btnUpdate;;
	private JButton btnDelete;
	private JButton btnConfiguracion;
	private JButton btnSalir;
	
	
	
	public Vista_MenuJuego() {
		
		InicializarComp();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		setVisible(true);
	}
	
	public void InicializarComp(){
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCreate = new JButton("Crear Nuevo Usuario");
		btnCreate.setBounds(129, 149, 191, 23);
		contentPane.add(btnCreate);
		
		btnRead = new JButton("Mostrar Datos de Usuario");
		btnRead.setBounds(129, 183, 191, 23);
		contentPane.add(btnRead);
		
		btnUpdate = new JButton("Actulizar los Datos de Usuario");
		btnUpdate.setBounds(129, 217, 191, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("Eliminar Datos de Usuario");
		btnDelete.setBounds(129, 252, 191, 23);
		contentPane.add(btnDelete);
		
		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(10, 252, 105, 23);
		contentPane.add(btnConfiguracion);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 252, 105, 23);
		contentPane.add(btnSalir);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	public JButton getBtnRead() {
		return btnRead;
	}

	public void setBtnRead(JButton btnRead) {
		this.btnRead = btnRead;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JButton getBtnConfiguracion() {
		return btnConfiguracion;
	}

	public void setBtnConfiguracion(JButton btnConfiguracion) {
		this.btnConfiguracion = btnConfiguracion;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
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