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
		
		Usuario[] usuariosBuscados;
		
		if (busqueda != null) {
			if (vista.getRdbtnBuscarNombre().isSelected()) {
				int caracteresBusqueda = busqueda.length();
				
				if (caracteresBusqueda >= 4 && caracteresBusqueda <= 50) {
					
					usuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_NOMBRE, busqueda);
					
					if(usuariosBuscados[0] != null) {
						mostrarUsuario(usuariosBuscados);
						
						
					}else {
						JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener entre 4 y 50 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
				
				
			}

			if (vista.getRdbtnBuscarPuntaje().isSelected()) {
				
				if (validarInt(busqueda)) {
					
					int ptje = Integer.parseInt(busqueda);
					
					if(ptje >= 1 && ptje <= 999) {
						usuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_PUNTAJE, busqueda);
						if(usuariosBuscados == null) {
							JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese puntaje", "ERROR", JOptionPane.ERROR_MESSAGE);
							
						}else {
							mostrarUsuario(usuariosBuscados);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Intente de nuevo ingresando un numero del 1 al 999", "ERROR", JOptionPane.ERROR_MESSAGE);
						
					}
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Por favor digite el formato correspondiente al tipo dato con el que desea buscar al usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
				
				
				
			}

			if (vista.getRdbtnBuscarNivel().isSelected()) {
				
				if (validarInt(busqueda)) {
					int nvl = Integer.parseInt(busqueda);
					
					if(nvl >= 1 && nvl <= 10) {
						usuariosBuscados = modelo.buscarUsuarios(DAO_Usuario.TIPO_NIVEL, busqueda);
						if(usuariosBuscados == null) {
							JOptionPane.showMessageDialog(null, "No se encontro ningun usuario con ese nivel", "ERROR", JOptionPane.ERROR_MESSAGE);
							
						}else {
							mostrarUsuario(usuariosBuscados);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Intente de nuevo ingresando un numero del 1 al 10", "ERROR", JOptionPane.ERROR_MESSAGE);
						
					}
				}else {
					JOptionPane.showMessageDialog(null, "Por favor digite el formato correspondiente al tipo dato con el que desea buscar al usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		} else {
			JOptionPane.showMessageDialog(null, "Digite la informacion solicitada", "ERROR", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	public void mostrarUsuario(Usuario[] u) {
		System.out.print("Encontrao");
	}
	
	
	public boolean validarInt(String s) {
		boolean resultado ;
		
		try {
            Integer.parseInt(s);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
		
		
		return resultado;
	}
	
	

}
