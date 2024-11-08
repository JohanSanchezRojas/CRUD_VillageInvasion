package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ActualizarUsuario;
import CRUD_VillageInvasion.vista.Vista_InsertarUsuario;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;
import CRUD_VillageInvasion.vista.Vista_MostrarUsuario;
import CRUD_VillageInvasion.vista.Vista_InsertarUsuario;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

/**
 * Johan David Sánchez Rojas C17305
 */
public class Controlador_MenuJuego implements ActionListener{
	private DAO_Usuario modelo;
	
	private Vista_MenuJuego vista;
	private Vista_InsertarUsuario vistaI;
	private Vista_MostrarUsuario vistaM;
	
	private Controlador_InsertarUsuario controladorI;
	private Controlador_MostrarUsuario controladorM;
	
	public Controlador_MenuJuego(DAO_Usuario modelo, Vista_MenuJuego vista) {
		this.modelo = modelo;
		this.vista = vista;
		
		vista.getjM_AgregarUsuario().addActionListener(this);
		vista.getjM_MostrarUsuario().addActionListener(this);
		vista.getjM_ActualizarUsuario().addActionListener(this);
		vista.getjM_EliminarUsuario().addActionListener(this);
		vista.getjM_Salir().addActionListener(this);
		vista.getBtnConfiguracion().addActionListener(this);
		vista.getBtnJugar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.getjM_AgregarUsuario()) {
			vistaI = new Vista_InsertarUsuario(vista);
			controladorI = new Controlador_InsertarUsuario(vistaI, modelo);
			System.out.println("Agregar Usuario");
		}
		
		if (e.getSource() == vista.getjM_MostrarUsuario()) {
			vistaM = new Vista_MostrarUsuario(vista);
			controladorM = new Controlador_MostrarUsuario(vistaM, modelo);
			System.out.println(modelo.getLista().imprimir());
		}
		
		if (e.getSource() == vista.getjM_ActualizarUsuario()) {
			System.out.println("Actualizar Usuario");
		}
		
		if (e.getSource() == vista.getjM_EliminarUsuario()) {
			System.out.println("Eliminar Usuario");
		}
		
		if (e.getSource() == vista.getjM_Salir()) {
			System.exit(0);
		}
		
		if (e.getSource() == vista.getBtnConfiguracion()) {
			System.out.println("Configuracion");
		}
		
		if (e.getSource() == vista.getBtnJugar()) {
			System.out.println("Jugar");
		}
	}

}
