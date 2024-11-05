package CRUD_VillageInvasion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Vista_MostrarUsuario extends JDialog {
	private JRadioButton rdbtnBuscarNombre;
	private JRadioButton rdbtnBuscarNivel;
	private JRadioButton rdbtnPuntaje;
	private JButton btnBuscar;
	private JButton btnMostrarUsuario;
	private JButton btnCancelar;
	private JTextArea tA_Resultado;
	private JTextField tfDato;

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
		JLabel lblTitulo1 = new JLabel("<html>Ingrese el dato con el que desea buscar al usuario<br>"
				+ "y luego seleccione el tipo de dato que ha ingresado</html>");
		lblTitulo1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitulo1.setToolTipText("");
		lblTitulo1.setBounds(77, 10, 238, 36);
		getContentPane().add(lblTitulo1);

		JLabel lblTitulo2 = new JLabel("Seleccione el usuario que desea buscar y presione \"Mostrar usuario\"");
		lblTitulo2.setBounds(45, 136, 323, 13);
		getContentPane().add(lblTitulo2);
		
		rdbtnBuscarNombre = new JRadioButton("Nombre");
		rdbtnBuscarNombre.setBounds(97, 78, 61, 21);
		getContentPane().add(rdbtnBuscarNombre);

		rdbtnBuscarNivel = new JRadioButton("Nivel");
		rdbtnBuscarNivel.setBounds(171, 78, 47, 21);
		getContentPane().add(rdbtnBuscarNivel);

		rdbtnPuntaje = new JRadioButton("Puntaje");
		rdbtnPuntaje.setBounds(230, 78, 61, 21);
		getContentPane().add(rdbtnPuntaje);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(147, 105, 85, 21);
		getContentPane().add(btnBuscar);

		btnMostrarUsuario = new JButton("Mostrar usuario");
		btnMostrarUsuario.setBounds(75, 192, 105, 21);
		getContentPane().add(btnMostrarUsuario);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(230, 192, 85, 21);
		getContentPane().add(btnCancelar);
		
		tA_Resultado = new JTextArea();
		tA_Resultado.setBounds(88, 153, 215, 29);
		getContentPane().add(tA_Resultado);
		
		tfDato = new JTextField();
		tfDato.setBounds(87, 48, 215, 24);
		getContentPane().add(tfDato);
		tfDato.setColumns(10);
	}
	
	
}
