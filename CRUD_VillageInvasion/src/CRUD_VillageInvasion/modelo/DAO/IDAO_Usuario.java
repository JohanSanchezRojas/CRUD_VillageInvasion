package CRUD_VillageInvasion.modelo.DAO;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Joshua Chacón Alvarez C4E105
 */
public interface IDAO_Usuario {
	
	
	public abstract boolean insertar(Usuario u);

	public abstract Usuario[] buscarUsuarios(String tipo, String dato);
	
	public abstract boolean eliminar(int id);
}