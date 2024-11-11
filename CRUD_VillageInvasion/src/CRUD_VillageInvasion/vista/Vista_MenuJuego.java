package CRUD_VillageInvasion.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Vista_MenuJuego extends JFrame {
	private JMenuItem jM_InsertarUsuario;
	private JMenuItem jM_MostrarUsuario;
	private JMenuItem jM_ActualizarUsuario;
	private JMenuItem jM_EliminarUsuario;
	private JMenuItem jM_Salir;
	private JButton btnConfiguracion;
	private JButton btnJugar;
	
	public Vista_MenuJuego() {
		initComponents();
		setTitle("VILLAGE INVASION");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenuJuego = new JMenu("Menu Village Invasion");
		menuBar.add(mnMenuJuego);
		
		jM_InsertarUsuario = new JMenuItem("Insertar usuario");
		mnMenuJuego.add(jM_InsertarUsuario);
		
		jM_MostrarUsuario = new JMenuItem("Mostrar usuario");
		mnMenuJuego.add(jM_MostrarUsuario);
		
		jM_ActualizarUsuario = new JMenuItem("Actualizar usuario");
		mnMenuJuego.add(jM_ActualizarUsuario);
		
		jM_EliminarUsuario = new JMenuItem("Eliminar usuario");
		mnMenuJuego.add(jM_EliminarUsuario);
		
		jM_Salir = new JMenuItem("Salir");
		mnMenuJuego.add(jM_Salir);
		
		btnConfiguracion = new JButton("Configuracion");
		menuBar.add(btnConfiguracion);
		
		btnJugar = new JButton("Jugar");
		menuBar.add(btnJugar);
	}

	public JMenuItem getjM_AgregarUsuario() {
		return jM_InsertarUsuario;
	}

	public void setjM_AgregarUsuario(JMenuItem jM_AgregarUsuario) {
		this.jM_InsertarUsuario = jM_AgregarUsuario;
	}

	public JMenuItem getjM_InsertarUsuario() {
		return jM_InsertarUsuario;
	}

	public void setjM_InsertarUsuario(JMenuItem jM_InsertarUsuario) {
		this.jM_InsertarUsuario = jM_InsertarUsuario;
	}

	public JMenuItem getjM_MostrarUsuario() {
		return jM_MostrarUsuario;
	}

	public void setjM_MostrarUsuario(JMenuItem jM_MostrarUsuario) {
		this.jM_MostrarUsuario = jM_MostrarUsuario;
	}

	public JMenuItem getjM_ActualizarUsuario() {
		return jM_ActualizarUsuario;
	}

	public void setjM_ActualizarUsuario(JMenuItem jM_ActualizarUsuario) {
		this.jM_ActualizarUsuario = jM_ActualizarUsuario;
	}

	public JMenuItem getjM_EliminarUsuario() {
		return jM_EliminarUsuario;
	}

	public void setjM_EliminarUsuario(JMenuItem jM_EliminarUsuario) {
		this.jM_EliminarUsuario = jM_EliminarUsuario;
	}

	public JMenuItem getjM_Salir() {
		return jM_Salir;
	}

	public void setjM_Salir(JMenuItem jM_Salir) {
		this.jM_Salir = jM_Salir;
	}

	public JButton getBtnConfiguracion() {
		return btnConfiguracion;
	}

	public void setBtnConfiguracion(JButton btnConfiguracion) {
		this.btnConfiguracion = btnConfiguracion;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}
}