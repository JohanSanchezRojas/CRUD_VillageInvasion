package CRUD_VillageInvasion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vista_MostrarUsuario extends JDialog {

	public Vista_MostrarUsuario(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Insertar usuario");
		setSize(424, 250);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		this.setVisible(true);
	}

	private void initComponents() {
		
	}
}
