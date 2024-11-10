package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ConfirmarEliminacion;

public class Controlador_ConfirmarEliminacion implements ActionListener{
	private DAO_Usuario modelo;
	private Vista_ConfirmarEliminacion vista;

	private Usuario usuario;
	
	public Controlador_ConfirmarEliminacion(DAO_Usuario modelo, Vista_ConfirmarEliminacion vista, Usuario usuario) {
		this.modelo = modelo;
		this.vista = vista;
		this.usuario = usuario;
		
		vista.getLblInformacionUsuario().setText("<html>Informacion el usuario:<br>" + usuario.imprimir());
		
		vista.getBtnEliminarUsuario().addActionListener(actionListenerEliminar());
		vista.getBtnCancelar().addActionListener(actionListenerSalir());
	}

	private ActionListener actionListenerEliminar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario[] lista = modelo.getLista().getListaUsuarios();
				
				for (int i = 0; i < lista.length; i++) {
					if (lista[i] != null) {
						if (lista[i].getId() == usuario.getId()) {
							lista[i] = null;
							
							modelo.getLista().setListaUsuarios(lista);
							
							i = lista.length;
							
							JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente", "",
									JOptionPane.PLAIN_MESSAGE);
							
							vista.dispose();
						}
					}
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
	}
}
