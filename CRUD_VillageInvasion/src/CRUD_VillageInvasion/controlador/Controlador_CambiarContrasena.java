package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ActualizarUsuario;
import CRUD_VillageInvasion.vista.Vista_CambiarContrasena;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

public class Controlador_CambiarContrasena implements ActionListener {
	private DAO_Usuario modelo;
	
	private Vista_CambiarContrasena vista;
	
	private Usuario usuario;
	
	private Usuario[] listaUsuariosBuscados;
	
	public Controlador_CambiarContrasena(Vista_CambiarContrasena vista, DAO_Usuario modelo, Usuario usuario) {
		this.vista = vista;
		this.modelo = modelo;
		this.usuario = usuario;
		
		vista.getLblInformacionUsuario().setText("<html>Informacion el usuario:<br>" + usuario.imprimir());
		
		vista.getBtnCambiarContrasena().addActionListener(this);
		vista.getBtnCancelar().addActionListener(this);;
	}

//	private ActionListener "Nombre"() {
//    return new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//            //Logica
//        }
//    };
//}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
		
		if (e.getSource() == vista.getBtnCancelar()) {
			vista.dispose();
		}
	}
	
	
	
	
	
}
