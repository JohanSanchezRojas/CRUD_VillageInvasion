package CRUD_VillageInvasion.modelo.DAO.array;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Configuracion;
import CRUD_VillageInvasion.modelo.dataset.Configuracion;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class DAO_Configuracion implements IDAO_Configuracion{
	private Configuracion configuracion = Principal.configuracion;

	public boolean guardar(String tipoEnemigos, int nivel, int cantidadEnemigo1, int cantidadEnemigo2,
			int cantidadEnemigo3, int vidasExtra, double velocidadJuego, String arma, boolean aumentarDificultad) {
		configuracion.setTipoEnemigos(tipoEnemigos);
		configuracion.setNivel(nivel);
		configuracion.setCantidadEnemigo1(cantidadEnemigo1);
		configuracion.setCantidadEnemigo2(cantidadEnemigo2);
		configuracion.setCantidadEnemigo3(cantidadEnemigo3);
		configuracion.setVidasExtra(vidasExtra);
		configuracion.setVelocidadJuego(velocidadJuego);
		configuracion.setArma(arma);
		configuracion.setAumentarDificultad(aumentarDificultad);
		
		return true;
	}
	
	public String imprimir() {
		return configuracion.imprimir();
	}
	
	public void cargarDatosPrueba() { // se agregar datos de prueba
		guardar("AAAA", 0, 0, 0, 0, 0, 0, "Arco", false);
	}
}