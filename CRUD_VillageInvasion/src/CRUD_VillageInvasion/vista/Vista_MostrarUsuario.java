package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_MostrarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSeleccion;
	private JButton btnBuscarNombre;
	private JButton btnBuscarNivel;
	private JButton btnBuscarPuntaje;
	
	public Vista_MostrarUsuario() {
		
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
		
		lblSeleccion = new JLabel("Seleccione como desesa buscar los datos de Usuario:");
		lblSeleccion.setBounds(85, 46, 261, 14);
		contentPane.add(lblSeleccion);
		
		btnBuscarNombre = new JButton("Buscar Usuario por nombre");
		btnBuscarNombre.setBounds(127, 100, 172, 23);
		contentPane.add(btnBuscarNombre);
		
		btnBuscarPuntaje = new JButton("Buscar Usuario por puntaje");
		btnBuscarPuntaje.setBounds(127, 170, 172, 23);
		contentPane.add(btnBuscarPuntaje);
		
		btnBuscarNivel = new JButton("Buscar Usuario por nivel");
		btnBuscarNivel.setBounds(126, 134, 173, 23);
		contentPane.add(btnBuscarNivel);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JLabel getLblSeleccion() {
		return lblSeleccion;
	}

	public void setLblSeleccion(JLabel lblSeleccion) {
		this.lblSeleccion = lblSeleccion;
	}

	public JButton getBtnBuscarNombre() {
		return btnBuscarNombre;
	}

	public void setBtnBuscarNombre(JButton btnBuscarNombre) {
		this.btnBuscarNombre = btnBuscarNombre;
	}

	public JButton getBtnBuscarNivel() {
		return btnBuscarNivel;
	}

	public void setBtnBuscarNivel(JButton btnBuscarNivel) {
		this.btnBuscarNivel = btnBuscarNivel;
	}

	public JButton getBtnBuscarPuntaje() {
		return btnBuscarPuntaje;
	}

	public void setBtnBuscarPuntaje(JButton btnBuscarPuntaje) {
		this.btnBuscarPuntaje = btnBuscarPuntaje;
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