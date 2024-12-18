package CRUD_VillageInvasion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Vista_MostrarUsuario extends JDialog {
	private JRadioButton rdbtnBuscarNombre;
	private JRadioButton rdbtnBuscarNivel;
	private JRadioButton rdbtnBuscarPuntaje;
	private ButtonGroup bG_Tipo;
	private JButton btnBuscar;
	private JButton btnMostrarUsuario;
	private JButton btnCancelar;
	private JTextField tfDato;
	private JScrollPane sP_Resultado;
	private JList list_Usuarios;

	public Vista_MostrarUsuario(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Mostrar usuario");
		setSize(781, 530);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		JLabel lblTitulo1 = new JLabel("<html>Ingrese el dato con el que desea buscar al usuario<br>"
				+ "y luego seleccione el tipo de dato que ha ingresado</html>");
		lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo1.setToolTipText("");
		lblTitulo1.setBounds(183, 11, 388, 36);
		getContentPane().add(lblTitulo1);

		JLabel lblTitulo2 = new JLabel("Seleccione el usuario que desea buscar y presione \"Mostrar usuario\"");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setBounds(183, 149, 388, 13);
		getContentPane().add(lblTitulo2);
		
		sP_Resultado = new JScrollPane();
		sP_Resultado.setBounds(193, 179, 378, 204);
		getContentPane().add(sP_Resultado);
		
		list_Usuarios = new JList();
		sP_Resultado.setViewportView(list_Usuarios);
		list_Usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		rdbtnBuscarNombre = new JRadioButton("Nombre");
		rdbtnBuscarNombre.setBounds(223, 78, 71, 21);
		getContentPane().add(rdbtnBuscarNombre);

		rdbtnBuscarNivel = new JRadioButton("Nivel");
		rdbtnBuscarNivel.setBounds(353, 78, 58, 21);
		getContentPane().add(rdbtnBuscarNivel);

		rdbtnBuscarPuntaje = new JRadioButton("Puntaje");
		rdbtnBuscarPuntaje.setBounds(468, 78, 72, 21);
		getContentPane().add(rdbtnBuscarPuntaje);
		
		bG_Tipo = new ButtonGroup();
		bG_Tipo.add(rdbtnBuscarNombre);
		bG_Tipo.add(rdbtnBuscarNivel);
		bG_Tipo.add(rdbtnBuscarPuntaje);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(340, 117, 85, 21);
		getContentPane().add(btnBuscar);

		btnMostrarUsuario = new JButton("Mostrar usuario");
		btnMostrarUsuario.setBounds(166, 394, 107, 21);
		getContentPane().add(btnMostrarUsuario);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(539, 394, 85, 21);
		getContentPane().add(btnCancelar);
		
		tfDato = new JTextField();
		tfDato.setBounds(274, 47, 215, 24);
		getContentPane().add(tfDato);
		tfDato.setColumns(10);
		
		
	}

	public JList getList_Usuarios() {
		return list_Usuarios;
	}

	public void setList_Usuarios(JList list_Usuarios) {
		this.list_Usuarios = list_Usuarios;
	}

	public JRadioButton getRdbtnBuscarNombre() {
		return rdbtnBuscarNombre;
	}

	public void setRdbtnBuscarNombre(JRadioButton rdbtnBuscarNombre) {
		this.rdbtnBuscarNombre = rdbtnBuscarNombre;
	}

	public JRadioButton getRdbtnBuscarNivel() {
		return rdbtnBuscarNivel;
	}

	public void setRdbtnBuscarNivel(JRadioButton rdbtnBuscarNivel) {
		this.rdbtnBuscarNivel = rdbtnBuscarNivel;
	}

	public JRadioButton getRdbtnBuscarPuntaje() {
		return rdbtnBuscarPuntaje;
	}

	public void setRdbtnBuscarPuntaje(JRadioButton rdbtnPuntaje) {
		this.rdbtnBuscarPuntaje = rdbtnPuntaje;
	}

	public ButtonGroup getbGroup() {
		return bG_Tipo;
	}

	public void setbGroup(ButtonGroup bGroup) {
		this.bG_Tipo = bGroup;
	}
	
	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnMostrarUsuario() {
		return btnMostrarUsuario;
	}

	public void setBtnMostrarUsuario(JButton btnMostrarUsuario) {
		this.btnMostrarUsuario = btnMostrarUsuario;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JTextField getTfDato() {
		return tfDato;
	}

	public void setTfDato(JTextField tfDato) {
		this.tfDato = tfDato;
	}

	public JScrollPane getsP_Resultado() {
		return sP_Resultado;
	}

	public void setsP_Resultado(JScrollPane sP_Resultado) {
		this.sP_Resultado = sP_Resultado;
	}
}