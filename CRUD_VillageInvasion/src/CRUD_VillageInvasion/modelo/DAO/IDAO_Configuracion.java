package CRUD_VillageInvasion.modelo.DAO;

public interface IDAO_Configuracion {

	public boolean guardar(String tipoEnemigos, int nivel, int cantidadEnemigo1, int cantidadEnemigo2,
			int cantidadEnemigo3, int vidasExtra, double velocidadJuego, String arma, boolean aumentarDificultad);
	
	public String imprimir();
}
