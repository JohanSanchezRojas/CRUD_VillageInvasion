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
			System.out.println("HOLA");
		}
		
		
		
//		if (e.getSource() == vista.getjM_Mostrar()){
//        	vistaM = new Vista_Mostrar(vista);            
//        	controladorM = new Controlador_Mostrar(vistaM, modelo);
//        }
	}

}
