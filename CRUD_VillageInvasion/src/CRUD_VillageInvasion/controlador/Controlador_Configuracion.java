package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.DAO.array.DAO_Configuracion;
import CRUD_VillageInvasion.vista.Vista_Configuracion;

public class Controlador_Configuracion implements ActionListener {
	private Vista_Configuracion vista;
	private DAO_Configuracion modelo;

	private int cantidadEnemigos1 = 0;
	private int cantidadEnemigos2 = 0;
	private int cantidadEnemigos3 = 0;

	public Controlador_Configuracion(Vista_Configuracion vista, DAO_Configuracion modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnGuardarTipoEnemigos().addActionListener(ActionListenerGuardarEnemigos());
		vista.getBtnGuardarConfiguraciones().addActionListener(ActionListenerGuardarConfiguraciones());
		vista.getBtnCancelar().addActionListener(ActionListenerSalir());
	}

	private ActionListener ActionListenerGuardarEnemigos() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cantidad = null;

				cantidad = vista.getTextFieldCantidad().getText();

				if (cantidad.equals("")) {
					JOptionPane.showMessageDialog(null, "Porfavor digite la informacion solicitada", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}

				if (vista.getRdbtnEnemigo1().isSelected() == false && vista.getRdbtnEnemigo2().isSelected() == false
						&& vista.getRdbtnEnemigo3().isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione uno de los tipos de enemigos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}

				if (vista.getRdbtnEnemigo1().isSelected()) {
					if (validarInt(cantidad)) {
						cantidadEnemigos1 = Integer.parseInt(cantidad);
					}
				}

				if (vista.getRdbtnEnemigo2().isSelected()) {
					if (validarInt(cantidad)) {
						cantidadEnemigos2 = Integer.parseInt(cantidad);
					}
				}

				if (vista.getRdbtnEnemigo3().isSelected()) {
					if (validarInt(cantidad)) {
						cantidadEnemigos3 = Integer.parseInt(cantidad);
					}
				}
			}
		};
	}

	private ActionListener ActionListenerGuardarConfiguraciones() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enemigos = "";
				String vidas = "";
				String velocidad = "";

				int nivel = 0;
				String arma = "";
				Boolean dificultad = false;

				boolean guardar = true;

				enemigos = vista.getTextFieldEnemigos().getText();
				vidas = vista.getTextFieldVidas().getText();
				velocidad = vista.getTextFieldVelocidad().getText();

				if (enemigos.equals("") || vidas.equals("") || velocidad.equals("")) {
					JOptionPane.showMessageDialog(null, "Porfavor digite la informacion solicitada", "ERROR",
							JOptionPane.ERROR_MESSAGE);

					guardar = false;
				}

				if (vista.getbG_Niveles().getSelection() == null || vista.getbG_Armas().getSelection() == null
						|| vista.getbG_AumentarDificultad().getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione cada opcion de configuracion mostrada",
							"ERROR", JOptionPane.ERROR_MESSAGE);

					guardar = false;
				}

				if (guardar) {
					if (validarInt(vidas) && validarDouble(velocidad)) {
						int cantidadVidas = Integer.parseInt(vidas);
						double cantidadVelocidad = Double.parseDouble(velocidad);

						nivel = Integer.parseInt(vista.getbG_Niveles().getSelection().getActionCommand());
						arma = vista.getbG_Armas().getSelection().getActionCommand();
						dificultad = Boolean
								.parseBoolean(vista.getbG_AumentarDificultad().getSelection().getActionCommand());

						modelo.guardar(enemigos, nivel, cantidadEnemigos1, cantidadEnemigos2, cantidadEnemigos3,
								cantidadVidas, cantidadVelocidad, arma, dificultad);

						JOptionPane.showMessageDialog(null, "Configuraciones guardadas con exito", "",
								JOptionPane.PLAIN_MESSAGE);
						
						System.out.println(modelo.imprimir());
					}
				}
			}
		};
	}

	private ActionListener ActionListenerSalir() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.dispose();
			}
		};
	}

	public boolean validarInt(String s) {
		boolean resultado;

		try {
			Integer.parseInt(s);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}

	public boolean validarDouble(String s) {
		boolean resultado;

		try {
			Double.parseDouble(s);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
