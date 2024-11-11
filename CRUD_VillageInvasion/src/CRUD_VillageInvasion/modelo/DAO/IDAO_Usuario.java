package CRUD_VillageInvasion.modelo.DAO;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public interface IDAO_Usuario {
	
	public abstract boolean insertar(Usuario u);

	public abstract Usuario[] buscarUsuarios(String tipo, String dato);
	
	public abstract boolean eliminar(int id);
}