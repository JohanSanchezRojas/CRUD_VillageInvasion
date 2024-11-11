package CRUD_VillageInvasion.modelo.DAO.archivoTexto;

import java.io.IOException;

import CRUD_VillageInvasion.Principal;
import CRUD_VillageInvasion.modelo.Usuario;
import CRUD_VillageInvasion.modelo.DAO.IDAO_Usuario;
import CRUD_VillageInvasion.modelo.dataset.ListaUsuarios;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class DAO_Usuario implements IDAO_Usuario {
	public static final String TIPO_NOMBRE = "NOMBRE";
	public static final String TIPO_NIVEL = "NIVEL";
	public static final String TIPO_PUNTAJE = "PUNTAJE";
	private ListaUsuarios lista = Principal.lista;
	
	WriterManager writer = new WriterManager();
    ReaderManager reader = new ReaderManager();

    public static final String FILE_NAME = "usuarioFile.txt";
	   
    public void cargarDatos(){ // se agregar datos de prueba     
        try {
            reader.open(FILE_NAME);
            reader.readUsuario();
            reader.close(); //importante cerrar el archivo

            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println("error se cargaron datos de prueba");

            cargarDatosPrueba(); ///SI HAY ERROR Y LA CARGA DEL ARCHIVO FALLA, TENER DATOS DE PRUEBA
            System.err.println(ex.getMessage());
        }
    }

    private void guardarLista(){ // se agregar datos de prueba            
        try {
            writer.open(FILE_NAME);  
            writer.writeAll();
            writer.close(); //importante cerrar el archivo 
            System.out.println("Escritura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
    }
    
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