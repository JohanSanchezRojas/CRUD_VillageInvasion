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
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Vista_EliminarUsuario extends JDialog {
	private JTextField tfNombreUsuario;
	private JButton btnBuscar;
	private JScrollPane sP_Resultado;
	private JList list_Usuarios;
	private JButton btnEliminarUsuario;
	private JButton btnCancelar;
	
	public Vista_EliminarUsuario(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Eliminar usuario");
		setSize(533, 399);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		this.setVisible(true);
	}
	
	private void initComponents() {
		JLabel lblTitulo0 = new JLabel("Digite el nombre del usuario que desea eliminar");
		lblTitulo0.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo0.setBounds(10, 11, 494, 14);
		getContentPane().add(lblTitulo0);
		
		tfNombreUsuario = new JTextField();
		tfNombreUsuario.setBounds(163, 36, 168, 47);
		getContentPane().add(tfNombreUsuario);
		tfNombreUsuario.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(204, 94, 89, 23);
		getContentPane().add(btnBuscar);
		
		JLabel lblTitulo1 = new JLabel("Seleccione el usuario que desea eliminar");
		lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo1.setBounds(10, 128, 494, 14);
		getContentPane().add(lblTitulo1);
		
		sP_Resultado = new JScrollPane();
		sP_Resultado.setBounds(141, 153, 234, 95);
		getContentPane().add(sP_Resultado);
		
		list_Usuarios = new JList();
		list_Usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sP_Resultado.setViewportView(list_Usuarios);
		
		btnEliminarUsuario = new JButton("Eliminar usuario");
		btnEliminarUsuario.setBounds(123, 273, 107, 23);
		getContentPane().add(btnEliminarUsuario);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(306, 273, 89, 23);
		getContentPane().add(btnCancelar);
	}

	public JTextField getTfNombreUsuario() {
		return tfNombreUsuario;
	}

	public void setTfNombreUsuario(JTextField tfNombreUsuario) {
		this.tfNombreUsuario = tfNombreUsuario;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JScrollPane getsP_Resultado() {
		return sP_Resultado;
	}

	public void setsP_Resultado(JScrollPane sP_Resultado) {
		this.sP_Resultado = sP_Resultado;
	}

	public JList getList_Usuarios() {
		return list_Usuarios;
	}

	public void setList_Usuarios(JList list_Usuarios) {
		this.list_Usuarios = list_Usuarios;
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