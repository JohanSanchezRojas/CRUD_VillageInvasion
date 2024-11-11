package CRUD_VillageInvasion.modelo.DAO;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public interface IDAO_Configuracion {

	public boolean guardar(String tipoEnemigos, int nivel, int cantidadEnemigo1, int cantidadEnemigo2,
			int cantidadEnemigo3, int vidasExtra, double velocidadJuego, String arma, boolean aumentarDificultad);
	
	public String imprimir();
}
