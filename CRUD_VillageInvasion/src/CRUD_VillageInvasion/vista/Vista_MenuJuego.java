package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Vista_MenuJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCreate;
	private JButton btnRead;
	private JButton btnUpdate;;
	private JButton btnDelete;
	
	
	
	
	public Vista_MenuJuego() {
		
		inicializarComp();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		setVisible(true);
	}
	
	public void inicializarComp(){
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCreate = new JButton("Crear Nuevo Usuario");
		btnCreate.setBounds(108, 125, 191, 23);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("Mostrar Datos de Usuario");
		btnRead.setBounds(108, 159, 191, 23);
		contentPane.add(btnRead);
		
		JButton btnUpdate = new JButton("Actulizar los Datos de Usuario");
		btnUpdate.setBounds(108, 193, 191, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Eliminar Datos de Usuario");
		btnDelete.setBounds(108, 227, 191, 23);
		contentPane.add(btnDelete);
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