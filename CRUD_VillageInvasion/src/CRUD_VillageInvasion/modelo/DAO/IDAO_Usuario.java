package CRUD_VillageInvasion.modelo.DAO;

import CRUD_VillageInvasion.modelo.Usuario;

/**
 * Joshua Chacón Alvarez C4E105
 */
public interface IDAO_Usuario {
	public static final String TIPO_NOMBRE = "NOMBRE";
	public static final String TIPO_NIVEL = "NIVEL";
	public static final String TIPO_PUNTAJE = "PUNTAJE";
	
	public abstract boolean insertar(Usuario u);

	public abstract Usuario generarUsuario();

	public abstract Usuario buscarUsuario(String tipo, String dato);
	
	public abstract boolean eliminar(int id);
}