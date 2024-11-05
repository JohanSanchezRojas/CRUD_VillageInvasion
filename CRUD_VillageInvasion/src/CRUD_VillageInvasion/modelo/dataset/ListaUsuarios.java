package CRUD_VillageInvasion.modelo.dataset;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Joshua Chacón Alvarez C4E105
 */
public class ListaUsuarios {
	private Usuario[] listaUsuarios;
	private int contarUsuarios;
	public static final int TAMANO = 50;

	public ListaUsuarios() {
		listaUsuarios = new Usuario[TAMANO];
		contarUsuarios = 0;
	}
	
	public ListaUsuarios(int tamano) {
        listaUsuarios = new Usuario[tamano];
        contarUsuarios = 0;
    }
	
	public Usuario[] getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Usuario[] listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public void agregar(Usuario usuario) {
		
		if (usuario != null) {
			if (contarUsuarios == 0) {
				listaUsuarios[0] = usuario;
			} else if (contarUsuarios >= listaUsuarios.length) {
				crecer();
				listaUsuarios[contarUsuarios + 1] = usuario;
			} else {
				listaUsuarios[contarUsuarios + 1] = usuario;
			}
			contarUsuarios++;
		} 
		
		//REVISAR
		
//		int asignadorId = 0;
//		
//		if (contarUsuarios >= listaUsuarios.length) {
//			crecer();
//			//int posicion = contador - 1;
//			//usuarios[posicion].setId(asignadorId++); 
//			listaUsuarios[contarUsuarios++] = usuario;
//			contarUsuarios++;
//		} else {
//			if (usuario != null) {
//				//int posicion = contador - 1;
//				//usuarios[posicion].setId(asignadorId++); 
//				listaUsuarios[contarUsuarios++] = usuario;
//				contarUsuarios++;
//			}
//		}
	}

	public void crecer() {
		if (contarUsuarios >= listaUsuarios.length) {
			Usuario usuariosTemp[] = new Usuario[listaUsuarios.length * 2];
			
			for (int i = 0; i < listaUsuarios.length; i++) {
				if (listaUsuarios[i] != null) {
					usuariosTemp[i] = listaUsuarios[i];
				}
			}
			
			listaUsuarios = usuariosTemp;
		}
	}

	public Usuario getUsuario(String nombre) {
		int temp = 0;
		boolean ciclo = true;
		
		while (ciclo) {
			if (listaUsuarios[temp].getNombre() == nombre) {
				ciclo = false;
			} else {
				temp += 1;
			}
		}
		
		Usuario u = listaUsuarios[temp];
		return u;
	}

	public void eliminar(String nombre) {
		int temp = 0;
		boolean ciclo = true;

		while (ciclo) {
			if (listaUsuarios[temp].getNombre() == nombre) {
				listaUsuarios[temp] = null;
				ciclo = false;
			} else {
				temp += 1;
			}
		}
		
		corrimiento();
	}

	public void corrimiento() {
		Usuario uTemp[] = new Usuario[listaUsuarios.length];
		int intTemporal = 0;

		for (int i = 0; i < listaUsuarios.length; i++) {
			if (listaUsuarios[i] != null) {
				uTemp[intTemporal++] = listaUsuarios[i];
			}
		}
		
		listaUsuarios = uTemp;
	}

	public String imprimir() {
		String hilera = "";

		for (int i = 0; i < listaUsuarios.length; i++) {
			hilera = listaUsuarios[i].imprimir();
		}

		return hilera;
	}
}