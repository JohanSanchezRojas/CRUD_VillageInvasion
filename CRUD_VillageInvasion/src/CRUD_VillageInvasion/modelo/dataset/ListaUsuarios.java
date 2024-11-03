package CRUD_VillageInvasion.modelo.dataset;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Joshua Chacón Alvarez C4E105
 */
public class ListaUsuarios {
	private Usuario usuarios[];
	private int contador;
	public static final int TAMANO = 50;

	public ListaUsuarios() {
		usuarios = new Usuario[TAMANO];
		contador = 0;
	}

	public void agregar(Usuario u) {
		int asignadorId = 0;
		if (contador >= usuarios.length) {
			crecer();
			int posicion = contador - 1;
			usuarios[posicion].setId(asignadorId++);
			usuarios[contador++] = u;

		} else {
			if (u != null) {
				int posicion = contador - 1;
				usuarios[posicion].setId(asignadorId++);
				usuarios[contador++] = u;

			}
		}
	}

	public void crecer() {
		if (contador >= usuarios.length) {
			Usuario usuariosTemp[] = new Usuario[usuarios.length * 2];
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i] != null) {
					usuariosTemp[i] = usuarios[i];

				}
			}
			usuarios = usuariosTemp;

		}
	}

	public Usuario getUsuario(String nombre) {
		int temp = 0;
		boolean ciclo = true;
		while (ciclo) {
			if (usuarios[temp].getNombre() == nombre) {
				ciclo = false;

			} else {
				temp += 1;

			}
		}
		Usuario u = usuarios[temp];
		return u;

	}

	public void eliminar(String nombre) {
		int temp = 0;
		boolean ciclo = true;

		while (ciclo) {
			if (usuarios[temp].getNombre() == nombre) {
				usuarios[temp] = null;
				ciclo = false;

			} else {
				temp += 1;

			}
		}
		corrimiento();

	}

	public void corrimiento() {
		Usuario uTemp[] = new Usuario[usuarios.length];
		int intTemporal = 0;

		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				uTemp[intTemporal++] = usuarios[i];

			}

		}

		usuarios = uTemp;

	}

	public String imprimir() {
		String hilera = "";

		for (int i = 0; i < usuarios.length; i++) {
			hilera = usuarios[i].imprimir();
		}

		return hilera;

	}
}