package CRUD_VillageInvasion.modelo.DAO.array;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Usuario;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 */
public class DAO_Usuario implements IDAO_Usuario {
	public static final String TIPO_NOMBRE = "NOMBRE";
	public static final String TIPO_NIVEL = "NIVEL";
	public static final String TIPO_PUNTAJE = "PUNTAJE";
	private ListaUsuarios lista = Principal.lista;

	@Override
	public boolean insertar(Usuario u) {
		lista.agregar(u);
		return true;
	}

	@Override
	public Usuario[] buscarUsuarios(String tipo, String dato) {
		Usuario usuariosBusqueda[] = new Usuario[lista.getTamaño()];
		
		switch (tipo) {
		case TIPO_NOMBRE:
			usuariosBusqueda[0] = lista.getUsuarioNom(dato);
			break;
			
		case TIPO_PUNTAJE:
			int ptje = Integer.parseInt(dato);
			usuariosBusqueda = lista.getUsuarioPtje(ptje);
			break;
			
		case TIPO_NIVEL:
			int nvl = Integer.parseInt(dato);
			usuariosBusqueda = lista.getUsuarioNvl(nvl);
			break;

		default:
			break;
		}

		return usuariosBusqueda;
	}

	@Override
	public boolean eliminar(int id) {
		return false;
	}

	public ListaUsuarios getLista() {
		return lista;
	}
	
	public void setLista(ListaUsuarios lista) {
		this.lista = lista;
	}

	public void cargarDatosPrueba() { // se agregar datos de prueba
		insertar(new Usuario("Pepe", "1234"));
		insertar(new Usuario("Robertin", "1234"));
		insertar(new Usuario("Bartolo", "1234"));
	}
}