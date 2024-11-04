package CRUD_VillageInvasion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Vista_MenuJuego extends JFrame {
	private JMenuItem jM_InsertarUsuario;
	
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
		
		JMenu mnMenuJuego = new JMenu("Menu Juego Village Invasion");
		menuBar.add(mnMenuJuego);
		
		jM_InsertarUsuario = new JMenuItem("Insertar usuario");
		mnMenuJuego.add(jM_InsertarUsuario);
		
		JMenuItem jM_MostrarUsuario = new JMenuItem("Mostrar usuario");
		mnMenuJuego.add(jM_MostrarUsuario);
		
		JMenuItem jM_ActualizarUsuario = new JMenuItem("Actualizar usuario");
		mnMenuJuego.add(jM_ActualizarUsuario);
		
		JMenuItem jM_EliminarUsuario = new JMenuItem("Eliminar usuario");
		mnMenuJuego.add(jM_EliminarUsuario);
	}

	public JMenuItem getjM_AgregarUsuario() {
		return jM_InsertarUsuario;
	}

	public void setjM_AgregarUsuario(JMenuItem jM_AgregarUsuario) {
		this.jM_InsertarUsuario = jM_AgregarUsuario;
	}

	
}