package CRUD_VillageInvasion;

import CRUD_VillageInvasion.controlador.Controlador_MenuJuego;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.archivoTexto.DAO_Configuracion;
import CRUD_VillageInvasion.modelo.DAO.archivoTexto.DAO_Usuario;
import CRUD_VillageInvasion.modelo.dataset.Configuracion;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;
import CRUD_VillageInvasion.vista.Vista_MenuJuego;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Principal {

	public static ListaUsuarios lista = new ListaUsuarios();
	public static Configuracion configuracion = new Configuracion();

	public static void main(String[] args) {
		DAO_Usuario modelo = new DAO_Usuario();
		DAO_Configuracion modeloC = new DAO_Configuracion();
		
//		modelo.cargarDatosPrueba();
		
		modelo.cargarDatos();
		
		Vista_MenuJuego vista = new Vista_MenuJuego();
		
		Controlador_MenuJuego controlador = new Controlador_MenuJuego(modelo, modeloC, vista);
	}
}