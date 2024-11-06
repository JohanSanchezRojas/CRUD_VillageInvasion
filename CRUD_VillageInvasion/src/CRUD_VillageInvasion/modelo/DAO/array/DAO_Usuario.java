package CRUD_VillageInvasion.modelo.DAO.array;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Usuario;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 */
public class DAO_Usuario implements IDAO_Usuario {
	private ListaUsuarios lista = Principal.lista;

	@Override
	public boolean insertar(Usuario u) {
		lista.agregar(u);
		return true;
	}

	@Override
	public Usuario[] buscarUsuarios(String tipo, String dato) {
		

		return null;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public ListaUsuarios getLista() {
		return lista;
	}

	public void setLista(ListaUsuarios lista) {
		this.lista = lista;
	}

	public void cargarDatosPrueba() { // se agregar datos de prueba
		insertar(new Usuario("Pepe", "1234"));
		insertar(new Usuario("Robertin", "1234"));
		insertar(new Usuario("Bartolo", "1234"));
	}
}