package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Usuario;
import CRUD_VillageInvasion.modelo.DAO.archivoTexto.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ActualizarUsuario;
import CRUD_VillageInvasion.vista.Vista_CambiarContrasena;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;
import CRUD_VillageInvasion.vista.Vista_MostrarUsuario;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Controlador_ActualizarUsuario implements ActionListener {
	private DAO_Usuario modelo;
	
	private Vista_ActualizarUsuario vista;
	private Vista_MenuJuego vistaM;
	private Vista_CambiarContrasena vistaC;
	
	private Controlador_CambiarContrasena controladorC;
	
	private Usuario[] listaUsuariosBuscados;
	
	public Controlador_ActualizarUsuario(Vista_ActualizarUsuario vista, DAO_Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;

		vista.getBtnBuscar().addActionListener(actionListenerBuscar());
		vista.getBtnMostrarUsuario().addActionListener(actionListenerActualizar());
		vista.getBtnCancelar().addActionListener(actionListenerSalir());
	}

	private ActionListener actionListenerBuscar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String busqueda = null;

				busqueda = vista.getTfDato().getText();

				// Mostrar error en caso de el espacio de busqueda este vacio
				if (busqueda.equals("")) {
					JOptionPane.showMessageDialog(null, "Porfavor digite la informacion solicitada", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}

				// Mostrar error en caso de que se presione buscar pero no haya seleccionado el
				// tipo de dato
				if (vista.getRdbtnBuscarNombre().isSelected() == false
						&& vista.getRdbtnBuscarPuntaje().isSelected() == false
						&& vista.getRdbtnBuscarNivel().isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Porfavor seleccione una de las opciones de busqueda", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}

				// Opcion "Buscar Por Nombre"
				if (vista.getRdbtnBuscarNombre().isSelected()) {
					int caracteresBusqueda = busqueda.length();

					if (caracteresBusqueda >= 4 && caracteresBusqueda <= 50) {
						listaUsuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_NOMBRE, busqueda);

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

				// Opcion "Buscar Por Puntaje"
				if (vista.getRdbtnBuscarPuntaje().isSelected()) {
					if (validarInt(busqueda)) {
						int ptje = Integer.parseInt(busqueda);

						if (ptje >= 0) {
							listaUsuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_PUNTAJE, busqueda);

							if (listaUsuariosBuscados != null) {
								mostrarUsuario(listaUsuariosBuscados);
							} else if (listaUsuariosBuscados == null) {
								JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese puntaje",
										"ERROR", JOptionPane.ERROR_MESSAGE);
							}
						} else {
							JOptionPane.showMessageDialog(null, "Intente de nuevo ingresando un numero del 0 al 999",
									"ERROR", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Por favor digite el formato correspondiente al tipo dato con el que desea buscar al usuario",
								"ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}

				// Opcion "Buscar Por Nivel"
				if (vista.getRdbtnBuscarNivel().isSelected()) {
					if (validarInt(busqueda)) {
						int nvl = Integer.parseInt(busqueda);

						if (nvl >= 0 && nvl <= 10) {
							listaUsuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_NIVEL, busqueda);

							if (listaUsuariosBuscados == null) {
								JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese nivel",
										"ERROR", JOptionPane.ERROR_MESSAGE);

							} else {
								mostrarUsuario(listaUsuariosBuscados);
							}
						} else {
							JOptionPane.showMessageDialog(null, "Intente de nuevo ingresando un numero del 0 al 10",
									"ERROR", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Por favor digite el formato correspondiente al tipo dato con el que desea buscar al usuario",
								"ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		};
	}

	private ActionListener actionListenerActualizar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (vista.getList_Usuarios().getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Por favor seleccione uno de los usuarios mostrados", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int indice = vista.getList_Usuarios().getSelectedIndex();
					Usuario usuario = listaUsuariosBuscados[indice];
					
					vistaC = new Vista_CambiarContrasena(vistaM);
					controladorC = new Controlador_CambiarContrasena(vistaC, modelo, usuario);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// No es necesario usarla
//		private ActionListener "Nombre"() {
//	        return new ActionListener() {
//	            public void actionPerformed(ActionEvent e) {
//	                //Logica
//	            }
//	        };
//	    }
	}

	public void mostrarUsuario(Usuario[] u) {
		vista.getList_Usuarios().setListData(u);
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

}
