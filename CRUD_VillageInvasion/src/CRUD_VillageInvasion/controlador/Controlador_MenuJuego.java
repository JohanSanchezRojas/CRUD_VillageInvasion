package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

/**
 * Johan David Sánchez Rojas C17305
 */
public class Controlador_MenuJuego implements ActionListener{
	private DAO_Usuario modelo;
	
	private Vista_MenuJuego vista;
	
	public Controlador_MenuJuego(DAO_Usuario modelo, Vista_MenuJuego vista) {
		this.modelo = modelo;
		this.vista = vista;
		
		vista.getjM_AgregarUsuario().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.getjM_AgregarUsuario()) {
			System.out.println("Agregar Usuario");
		}
		
		if (e.getSource() == vista.getjM_MostrarUsuario()) {
			System.out.println("Mostrar Usuario");
		}
		
		if (e.getSource() == vista.getjM_ActualizarUsuario()) {
			System.out.println("Actualizar Usuario");
		}
		
		if (e.getSource() == vista.getjM_EliminarUsuario()) {
			System.out.println("Eliminar Usuario");
		}
		
		if (e.getSource() == vista.getjM_Salir()) {
			System.out.println("Salir");
		}
		
		if (e.getSource() == vista.getBtnConfiguracion()) {
			System.out.println("Configuracion");
		}
		
		if (e.getSource() == vista.getBtnJugar()) {
			System.out.println("Jugar");
		}
	}

}
