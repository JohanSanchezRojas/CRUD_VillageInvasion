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
	public Usuario generarUsuario() {
		// EN PROCESO Xd no sé si este metodo deberia existir despues lo hablamos
		return null;
	}

	@Override
	public boolean actualizarPorNombre(String nombre) {
		return true;
	}
	
	@Override
	public boolean actualizarPorNivel(int nivel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarPorPuntaje(int puntaje) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void cargarDatosPrueba(){ // se agregar datos de prueba
        insertar(new Usuario("Pepe", "1234"));
        insertar(new Usuario("Robertin", "1234"));
        insertar(new Usuario("Bartolo", "1234"));
	}
}
