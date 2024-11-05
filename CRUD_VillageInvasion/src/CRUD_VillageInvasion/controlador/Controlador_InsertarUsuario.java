package CRUD_VillageInvasion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.array.DAO_Usuario;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;
import CRUD_VillageInvasion.vista.Vista_InsertarUsuario;

public class Controlador_InsertarUsuario implements ActionListener {
	private Vista_InsertarUsuario vista;
	private DAO_Usuario modelo;

	public Controlador_InsertarUsuario(Vista_InsertarUsuario vista, DAO_Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;

		this.vista.getBtnAceptar().addActionListener(this);
		this.vista.getBtnCancelar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//CORREGIR USUARIOS REPETIDOS!!!!!!
		
		if (e.getSource() == vista.getBtnAceptar()) {
			String nombre;
			String contrasena;

			nombre = vista.getTfNombre().getText();
			contrasena = vista.getTfContrasena().getText();

			int caracteresNombre = nombre.length();
			int caracteresContrasena = contrasena.length();

			if (caracteresNombre >= 4 && caracteresNombre <= 50 && caracteresContrasena >= 4
					&& caracteresContrasena <= 10) {
				Usuario[] listaUsuarios = modelo.getLista().getListaUsuarios();
				String nombreAux = null;
				boolean repetirIngreso = true;

				for (int i = 0; i < listaUsuarios.length; i++) {

					if (listaUsuarios[i] != null) {
						nombreAux = listaUsuarios[i].getNombre();
					}

					if (nombreAux == nombre) {
						i = listaUsuarios.length;
						repetirIngreso = false;
					}
				}
				
				if (repetirIngreso) {
					Usuario usuario = new Usuario(nombre, contrasena);
					modelo.insertar(usuario);
					repetirIngreso = false;
					JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
					vista.borrarTF();
				} else {
					JOptionPane.showInternalMessageDialog(null, "El nombre de usuario ya existe, por favor elija otro");
				}

			} else {
				JOptionPane.showMessageDialog(null,
						"ERROR\n" + "El nombre de usuario debe tener entre 4 y 50 caracteres\n"
								+ "La contrasena debe tener entre y 4 y 10 caracteres");
			}
		}

		if (e.getSource() == vista.getBtnCancelar()) {
			vista.dispose();
		}
	}
}