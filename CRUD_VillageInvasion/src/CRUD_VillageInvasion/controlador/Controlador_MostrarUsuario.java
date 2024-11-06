package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Usuario;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_MostrarUsuario;

public class Controlador_MostrarUsuario implements ActionListener {
	private Vista_MostrarUsuario vista;
	private DAO_Usuario modelo;

	public Controlador_MostrarUsuario(Vista_MostrarUsuario vista, DAO_Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnBuscar().addActionListener(this);
		vista.getBtnMostrarUsuario().addActionListener(this);
		vista.getBtnCancelar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String busqueda;

		busqueda = vista.getTfDato().getText();
		
		Usuario[] usuarios = null;
		
		if (busqueda != null) {
			if (vista.getRdbtnBuscarNombre().isSelected()) {
				usuarios = modelo.buscarUsuarios(IDAO_Usuario.TIPO_NOMBRE, busqueda);
			}

			if (vista.getRdbtnBuscarPuntaje().isSelected()) {
				usuarios = modelo.buscarUsuarios(IDAO_Usuario.TIPO_PUNTAJE, busqueda);
			}

			if (vista.getRdbtnBuscarNivel().isSelected()) {
				usuarios = modelo.buscarUsuarios(IDAO_Usuario.TIPO_NIVEL, busqueda);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Digite la informacion solicitada", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

}
