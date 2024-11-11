package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CRUD_VillageInvasion.modelo.DAO.array.DAO_Configuracion;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ActualizarUsuario;
import CRUD_VillageInvasion.vista.Vista_Configuracion;
import CRUD_VillageInvasion.vista.Vista_EliminarUsuario;
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
	private DAO_Configuracion modeloC;
	
	private Vista_MenuJuego vista;
	private Vista_InsertarUsuario vistaI;
	private Vista_MostrarUsuario vistaM;
	private Vista_ActualizarUsuario vistaA;
	private Vista_EliminarUsuario vistaE;
	private Vista_Configuracion vistaC;
	
	private Controlador_InsertarUsuario controladorI;
	private Controlador_MostrarUsuario controladorM;
	private Controlador_ActualizarUsuario controladorA;
	private Controlador_EliminarUsuario controladorE;
	private Controlador_Configuracion controladorC;
	
	public Controlador_MenuJuego(DAO_Usuario modelo, DAO_Configuracion modeloC, Vista_MenuJuego vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.modeloC = modeloC;
		
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
			vistaA = new Vista_ActualizarUsuario(vista);
			controladorA = new Controlador_ActualizarUsuario(vistaA, modelo);
			System.out.println(modelo.getLista().imprimir());
		}
		
		if (e.getSource() == vista.getjM_EliminarUsuario()) {
			vistaE = new Vista_EliminarUsuario(vista);
			controladorE = new Controlador_EliminarUsuario(vistaE, modelo);
			System.out.println("Eliminar Usuario");
		}
		
		if (e.getSource() == vista.getjM_Salir()) {
			System.exit(0);
		}
		
		if (e.getSource() == vista.getBtnConfiguracion()) {
			vistaC = new Vista_Configuracion(vista);
			controladorC = new Controlador_Configuracion(vistaC, modeloC);
			System.out.println("Configuracion");
		}
		
		if (e.getSource() == vista.getBtnJugar()) {
			System.out.println("Jugar");
		}
	}

}
