package CRUD_VillageInvasion.modelo.DAO;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Joshua Chacón Alvarez C4E105
 */
public interface IDAO_Usuario {
	public abstract boolean insertar(Usuario u);

	public abstract Usuario generarUsuario();

	public abstract boolean actualizarPorNombre(String nombre);
	
	public abstract boolean actualizarPorNivel(int nivel);

	public abstract boolean actualizarPorPuntaje(int puntaje);

	public abstract boolean eliminar(int id);

	public abstract Usuario buscar(int id);

}