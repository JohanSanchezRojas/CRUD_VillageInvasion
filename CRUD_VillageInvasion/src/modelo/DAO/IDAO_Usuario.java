package modelo.DAO;

/**
 * Joshua Chacón Alvarez C4E105
 */

import modelo.Usuario;

public interface IDAO_Usuario {
	public abstract boolean insertar(Usuario u);

    public abstract Usuario generarPreguntaRandom();
    
    public abstract boolean actualizar(Usuario u);
    
    public abstract boolean eliminar(int id);
    
	public abstract Usuario buscar(int id);

}
