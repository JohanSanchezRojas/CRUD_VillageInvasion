package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.archivoTexto.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_CambiarContrasena;
import CRUD_VillageInvasion.vista.Vista_ConfirmarEliminacion;
import CRUD_VillageInvasion.vista.Vista_EliminarUsuario;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Controlador_EliminarUsuario implements ActionListener {
	private DAO_Usuario modelo;
	
	private Vista_EliminarUsuario vista;
	private Vista_MenuJuego vistaM;
	private Vista_ConfirmarEliminacion vistaC;
	
	private Controlador_ConfirmarEliminacion controladorC;
	
	private Usuario[] listaUsuariosBuscados;

	public Controlador_EliminarUsuario(Vista_EliminarUsuario vista, DAO_Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnBuscar().addActionListener(ActionListenerBuscar());
		vista.getBtnEliminarUsuario().addActionListener(actionListenerEliminar());
		vista.getBtnCancelar().addActionListener(actionListenerSalir());
	}

	private ActionListener ActionListenerBuscar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = null;

				nombre = vista.getTfNombreUsuario().getText();

				// Mostrar error en caso de el espacio de busqueda este vacio
				if (nombre.equals("")) {
					JOptionPane.showMessageDialog(null, "Porfavor digite la informacion solicitada", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}

				int caracteresBusqueda = nombre.length();

				if (caracteresBusqueda >= 4 && caracteresBusqueda <= 50) {
					listaUsuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_NOMBRE, nombre);

					if (listaUsuariosBuscados[0] != null) {
						mostrarUsuario(listaUsuariosBuscados);

					} else {
						JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese nombre", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener entre 4 y 50 caracteres",
							"ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		};
	}

	private ActionListener actionListenerEliminar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (vista.getList_Usuarios().getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Por favor seleccione uno de los usuarios mostrados", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int indice = vista.getList_Usuarios().getSelectedIndex();
					Usuario usuario = listaUsuariosBuscados[indice];
					
					vistaC = new Vista_ConfirmarEliminacion(vistaM);
					controladorC = new Controlador_ConfirmarEliminacion(modelo, vistaC, usuario);
				}
			}
		};
	}
	
	private ActionListener actionListenerSalir() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.dispose();
			}
		};
	}
	
	public void mostrarUsuario(Usuario[] u) {
		vista.getList_Usuarios().setListData(u);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
