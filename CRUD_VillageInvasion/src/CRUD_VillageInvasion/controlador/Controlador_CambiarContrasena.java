package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.vista.Vista_ActualizarUsuario;
import CRUD_VillageInvasion.vista.Vista_CambiarContrasena;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

public class Controlador_CambiarContrasena implements ActionListener {
	private DAO_Usuario modelo;
	private Vista_CambiarContrasena vista;

	private Usuario usuario;

	public Controlador_CambiarContrasena(Vista_CambiarContrasena vista, DAO_Usuario modelo, Usuario usuario) {
		this.vista = vista;
		this.modelo = modelo;
		this.usuario = usuario;

		vista.getLblInformacionUsuario().setText("<html>Informacion el usuario:<br>" + usuario.imprimir());

		vista.getBtnCambiarContrasena().addActionListener(actionListenerActualizar());
		vista.getBtnCancelar().addActionListener(actionListenerSalir());
	}

	private ActionListener actionListenerActualizar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrasenaAnterior = null;
				String contrasenaNueva = null;

				contrasenaAnterior = vista.getTfContrasenaAnterior().getText();
				contrasenaNueva = vista.getTfContrasenaNueva().getText();

				int caracteresContrasenaAnterior = contrasenaAnterior.length();
				int caracteresContrasenaNueva = contrasenaNueva.length();

				if (contrasenaAnterior.equals("") || contrasenaNueva.equals("")) {
					JOptionPane.showMessageDialog(null, "Porfavor rellene los espacios de texto con la informacion solicitada",
							"ERROR", JOptionPane.ERROR_MESSAGE);
				}

				if (caracteresContrasenaAnterior < 4 || caracteresContrasenaAnterior > 10 || caracteresContrasenaNueva < 4
						|| caracteresContrasenaNueva > 10) {
					JOptionPane.showMessageDialog(null, "La contrasena debe tener entre y 4 y 10 caracteres", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else if (usuario.getContraseña().equals(contrasenaAnterior)) {
					Usuario[] lista = modelo.getLista().getListaUsuarios();

					for (int i = 0; i < lista.length; i++) {
						if (lista[i] != null) {
							if (lista[i].getContraseña().equals(usuario.getContraseña())) {
								lista[i].setContraseña(contrasenaNueva);

								modelo.getLista().setListaUsuarios(lista);

								JOptionPane.showMessageDialog(null, "Contrasena cambiada con exito", "",
										JOptionPane.PLAIN_MESSAGE);

								vista.dispose();
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "La contrasena no coincide con la del usuario", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					vista.getTfContrasenaAnterior().setText("");
					vista.getTfContrasenaNueva().setText("");
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