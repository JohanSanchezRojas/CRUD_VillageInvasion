package CRUD_VillageInvasion.vista;

 //Andrew Mora M
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

public class Vista_Configuracion extends JDialog {
	
	//Text Fields
	private JTextField textFieldEnemigos;
	private JTextField textFieldCantidad;
	private JTextField textFieldVidas;
	private JTextField textFieldVelocidad;
	
	//Botones
	private JRadioButton rdbtnNivel1;
	private JRadioButton rdbtnNivel2;
	private JRadioButton rdbtnNivel3;
	private JRadioButton rdbtnNivel4;
	private JRadioButton rdbtnNivel5;
	private JRadioButton rdbtnNivel6;
	private JRadioButton rdbtnNivel7;
	private JRadioButton rdbtnNivel8;
	private JRadioButton rdbtnNivel9;
	private JRadioButton rdbtnNivel10;
	private JRadioButton rdbtnEnemigo1;
	private JRadioButton rdbtnEnemigo2;
	private JRadioButton rdbtnEnemigo3;
	private JRadioButton rdbtnArma1;
	private JRadioButton rdbtnArma2;
	private JRadioButton rdbtnArma3;
	private JRadioButton rdbtnActivar;
	private JRadioButton rdbtnDesactivar;
	
	//Labels
	private JLabel lblEnemigos;
	private JLabel lblNiveles;
	private JLabel lblCantidad;
	private JLabel lblVidas;
	private JLabel lblVelocidad;
	private JLabel lblArmas;
	private JLabel lblDificultad;
	
	public Vista_Configuracion(JFrame parent) {
		super(parent);
		initComponents();
		setTitle("Configuracion");
		setSize(488, 349);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

	private void initComponents() {
		
		textFieldEnemigos = new JTextField();
		textFieldEnemigos.setBounds(20, 48, 110, 20);
		getContentPane().add(textFieldEnemigos);
		textFieldEnemigos.setColumns(10);
		
		lblEnemigos = new JLabel("Tipos de Enemigos:");
		lblEnemigos.setBounds(20, 23, 110, 14);
		getContentPane().add(lblEnemigos);
		
		rdbtnNivel1 = new JRadioButton("Nivel 1");
		rdbtnNivel1.setBounds(309, 40, 60, 14);
		getContentPane().add(rdbtnNivel1);
		
		rdbtnNivel2 = new JRadioButton("Nivel 2");
		rdbtnNivel2.setBounds(370, 40, 60, 14);
		getContentPane().add(rdbtnNivel2);
		
		rdbtnNivel3 = new JRadioButton("Nivel 3");
		rdbtnNivel3.setBounds(309, 57, 60, 14);
		getContentPane().add(rdbtnNivel3);
		
		rdbtnNivel4 = new JRadioButton("Nivel 4");
		rdbtnNivel4.setBounds(371, 57, 60, 14);
		getContentPane().add(rdbtnNivel4);
		
		rdbtnNivel5 = new JRadioButton("Nivel 5");
		rdbtnNivel5.setBounds(309, 74, 60, 14);
		getContentPane().add(rdbtnNivel5);
		
		rdbtnNivel6 = new JRadioButton("Nivel 6");
		rdbtnNivel6.setBounds(370, 74, 60, 14);
		getContentPane().add(rdbtnNivel6);
		
		rdbtnNivel7 = new JRadioButton("Nivel 7");
		rdbtnNivel7.setBounds(309, 91, 60, 14);
		getContentPane().add(rdbtnNivel7);
		
		rdbtnNivel8 = new JRadioButton("Nivel 8");
		rdbtnNivel8.setBounds(370, 91, 60, 14);
		getContentPane().add(rdbtnNivel8);
		
		rdbtnNivel9 = new JRadioButton("Nivel 9");
		rdbtnNivel9.setBounds(309, 108, 60, 14);
		getContentPane().add(rdbtnNivel9);
		
		rdbtnNivel10 = new JRadioButton("Nivel 10");
		rdbtnNivel10.setBounds(370, 108, 73, 14);
		getContentPane().add(rdbtnNivel10);
		
		lblNiveles = new JLabel("Seleccionar Nivel:");
		lblNiveles.setBounds(329, 23, 85, 14);
		getContentPane().add(lblNiveles);
		
		lblCantidad = new JLabel("Cantidad de Enemigos por tipo:");
		lblCantidad.setBounds(20, 79, 150, 14);
		getContentPane().add(lblCantidad);
		
		rdbtnEnemigo1 = new JRadioButton("Enemigo 1");
		rdbtnEnemigo1.setBounds(20, 104, 75, 23);
		getContentPane().add(rdbtnEnemigo1);
		
		rdbtnEnemigo2 = new JRadioButton("Enemigo 2");
		rdbtnEnemigo2.setBounds(97, 104, 75, 23);
		getContentPane().add(rdbtnEnemigo2);
		
		rdbtnEnemigo3 = new JRadioButton("Enemigo 3");
		rdbtnEnemigo3.setBounds(174, 104, 75, 23);
		getContentPane().add(rdbtnEnemigo3);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(20, 134, 110, 20);
		getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		lblVidas = new JLabel("Vidas Extra:");
		lblVidas.setBounds(20, 165, 65, 14);
		getContentPane().add(lblVidas);
		
		textFieldVidas = new JTextField();
		textFieldVidas.setBounds(20, 190, 110, 20);
		getContentPane().add(textFieldVidas);
		textFieldVidas.setColumns(10);
		
		lblVelocidad = new JLabel("Velocidad del juego:");
		lblVelocidad.setBounds(20, 230, 110, 14);
		getContentPane().add(lblVelocidad);
		
		textFieldVelocidad = new JTextField();
		textFieldVelocidad.setBounds(20, 258, 110, 20);
		getContentPane().add(textFieldVelocidad);
		textFieldVelocidad.setColumns(10);
		
		lblArmas = new JLabel("Arma del Jugador:");
		lblArmas.setBounds(329, 137, 117, 14);
		getContentPane().add(lblArmas);
		
		rdbtnArma1 = new JRadioButton("Espada");
		rdbtnArma1.setBounds(329, 161, 73, 14);
		getContentPane().add(rdbtnArma1);
		
		rdbtnArma2 = new JRadioButton("Arco");
		rdbtnArma2.setBounds(329, 178, 73, 14);
		getContentPane().add(rdbtnArma2);
		
		rdbtnArma3 = new JRadioButton("Ballesta");
		rdbtnArma3.setBounds(329, 195, 73, 14);
		getContentPane().add(rdbtnArma3);
		
		lblDificultad = new JLabel("Aumentar Dificultad con cada nivel?");
		lblDificultad.setBounds(284, 230, 178, 14);
		getContentPane().add(lblDificultad);
		
		rdbtnActivar = new JRadioButton("Activar");
		rdbtnActivar.setBounds(294, 257, 60, 23);
		getContentPane().add(rdbtnActivar);
		
		rdbtnDesactivar = new JRadioButton("Desactivar");
		rdbtnDesactivar.setBounds(358, 257, 85, 23);
		getContentPane().add(rdbtnDesactivar);
		
	}

	public JTextField getTextFieldEnemigos() {
		return textFieldEnemigos;
	}

	public void setTextFieldEnemigos(JTextField textFieldEnemigos) {
		this.textFieldEnemigos = textFieldEnemigos;
	}

	public JTextField getTextFieldCantidad() {
		return textFieldCantidad;
	}

	public void setTextFieldCantidad(JTextField textFieldCantidad) {
		this.textFieldCantidad = textFieldCantidad;
	}

	public JTextField getTextFieldVidas() {
		return textFieldVidas;
	}

	public void setTextFieldVidas(JTextField textFieldVidas) {
		this.textFieldVidas = textFieldVidas;
	}

	public JTextField getTextFieldVelocidad() {
		return textFieldVelocidad;
	}

	public void setTextFieldVelocidad(JTextField textFieldVelocidad) {
		this.textFieldVelocidad = textFieldVelocidad;
	}

	public JRadioButton getRdbtnNivel1() {
		return rdbtnNivel1;
	}

	public void setRdbtnNivel1(JRadioButton rdbtnNivel1) {
		this.rdbtnNivel1 = rdbtnNivel1;
	}

	public JRadioButton getRdbtnNivel2() {
		return rdbtnNivel2;
	}

	public void setRdbtnNivel2(JRadioButton rdbtnNivel2) {
		this.rdbtnNivel2 = rdbtnNivel2;
	}

	public JRadioButton getRdbtnNivel3() {
		return rdbtnNivel3;
	}

	public void setRdbtnNivel3(JRadioButton rdbtnNivel3) {
		this.rdbtnNivel3 = rdbtnNivel3;
	}

	public JRadioButton getRdbtnNivel4() {
		return rdbtnNivel4;
	}

	public void setRdbtnNivel4(JRadioButton rdbtnNivel4) {
		this.rdbtnNivel4 = rdbtnNivel4;
	}

	public JRadioButton getRdbtnNivel5() {
		return rdbtnNivel5;
	}

	public void setRdbtnNivel5(JRadioButton rdbtnNivel5) {
		this.rdbtnNivel5 = rdbtnNivel5;
	}

	public JRadioButton getRdbtnNivel6() {
		return rdbtnNivel6;
	}

	public void setRdbtnNivel6(JRadioButton rdbtnNivel6) {
		this.rdbtnNivel6 = rdbtnNivel6;
	}

	public JRadioButton getRdbtnNivel7() {
		return rdbtnNivel7;
	}

	public void setRdbtnNivel7(JRadioButton rdbtnNivel7) {
		this.rdbtnNivel7 = rdbtnNivel7;
	}

	public JRadioButton getRdbtnNivel8() {
		return rdbtnNivel8;
	}

	public void setRdbtnNivel8(JRadioButton rdbtnNivel8) {
		this.rdbtnNivel8 = rdbtnNivel8;
	}

	public JRadioButton getRdbtnNivel9() {
		return rdbtnNivel9;
	}

	public void setRdbtnNivel9(JRadioButton rdbtnNivel9) {
		this.rdbtnNivel9 = rdbtnNivel9;
	}

	public JRadioButton getRdbtnNivel10() {
		return rdbtnNivel10;
	}

	public void setRdbtnNivel10(JRadioButton rdbtnNivel10) {
		this.rdbtnNivel10 = rdbtnNivel10;
	}

	public JRadioButton getRdbtnEnemigo1() {
		return rdbtnEnemigo1;
	}

	public void setRdbtnEnemigo1(JRadioButton rdbtnEnemigo1) {
		this.rdbtnEnemigo1 = rdbtnEnemigo1;
	}

	public JRadioButton getRdbtnEnemigo2() {
		return rdbtnEnemigo2;
	}

	public void setRdbtnEnemigo2(JRadioButton rdbtnEnemigo2) {
		this.rdbtnEnemigo2 = rdbtnEnemigo2;
	}

	public JRadioButton getRdbtnEnemigo3() {
		return rdbtnEnemigo3;
	}

	public void setRdbtnEnemigo3(JRadioButton rdbtnEnemigo3) {
		this.rdbtnEnemigo3 = rdbtnEnemigo3;
	}

	public JRadioButton getRdbtnArma1() {
		return rdbtnArma1;
	}

	public void setRdbtnArma1(JRadioButton rdbtnArma1) {
		this.rdbtnArma1 = rdbtnArma1;
	}

	public JRadioButton getRdbtnArma2() {
		return rdbtnArma2;
	}

	public void setRdbtnArma2(JRadioButton rdbtnArma2) {
		this.rdbtnArma2 = rdbtnArma2;
	}

	public JRadioButton getRdbtnArma3() {
		return rdbtnArma3;
	}

	public void setRdbtnArma3(JRadioButton rdbtnArma3) {
		this.rdbtnArma3 = rdbtnArma3;
	}

	public JRadioButton getRdbtnActivar() {
		return rdbtnActivar;
	}

	public void setRdbtnActivar(JRadioButton rdbtnActivar) {
		this.rdbtnActivar = rdbtnActivar;
	}

	public JRadioButton getRdbtnDesactivar() {
		return rdbtnDesactivar;
	}

	public void setRdbtnDesactivar(JRadioButton rdbtnDesactivar) {
		this.rdbtnDesactivar = rdbtnDesactivar;
	}

	public JLabel getLblEnemigos() {
		return lblEnemigos;
	}

	public void setLblEnemigos(JLabel lblEnemigos) {
		this.lblEnemigos = lblEnemigos;
	}

	public JLabel getLblNiveles() {
		return lblNiveles;
	}

	public void setLblNiveles(JLabel lblNiveles) {
		this.lblNiveles = lblNiveles;
	}

	public JLabel getLblCantidad() {
		return lblCantidad;
	}

	public void setLblCantidad(JLabel lblCantidad) {
		this.lblCantidad = lblCantidad;
	}

	public JLabel getLblVidas() {
		return lblVidas;
	}

	public void setLblVidas(JLabel lblVidas) {
		this.lblVidas = lblVidas;
	}

	public JLabel getLblVelocidad() {
		return lblVelocidad;
	}

	public void setLblVelocidad(JLabel lblVelocidad) {
		this.lblVelocidad = lblVelocidad;
	}

	public JLabel getLblArmas() {
		return lblArmas;
	}

	public void setLblArmas(JLabel lblArmas) {
		this.lblArmas = lblArmas;
	}

	public JLabel getLblDificultad() {
		return lblDificultad;
	}

	public void setLblDificultad(JLabel lblDificultad) {
		this.lblDificultad = lblDificultad;
	}
	
	
}
