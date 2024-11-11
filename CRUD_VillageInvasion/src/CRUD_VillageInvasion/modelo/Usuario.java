package CRUD_VillageInvasion.modelo;

/**
 * Johan David Sánchez Rojas C17305
 * Joshua Chacón Alvarez C4E105
 * Andrew Mora Mejia C05158
 */
public class Usuario {
	private String nombre;
	private String contrasena;
	private int nivel;
	private int puntaje;
	private int id;
	private static int sumaId = 1;

	public Usuario(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contrasena = contraseña;
		this.nivel = 0;
		this.puntaje = 0;
		this.id = sumaId;
		sumaId++;
	}

	public Usuario() {
		this.nombre = "";
		this.contrasena = "";
		this.nivel = 0;
		this.puntaje = 0;
		this.id = sumaId;
		sumaId++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contrasena;
	}

	public void setContraseña(String contraseña) {
		this.contrasena = contraseña;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void setId(int púntaje) {
		this.id = id;
	}
	
	public int getId() {
		return sumaId;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public String imprimir() {
		String hilera = "Nombre: " + nombre + ", Nivel: " + nivel + ", Puntaje: " + puntaje + ", Id: " + id + "\n" + contrasena;
		return hilera;
	}
	
	public String toFileString() {// IMPORTANTE: DEFINIMOS EL FORMATO DE CADA REGISTRO SEPARADO POR -
		return nombre + "-" + contrasena + "-" + nivel + "-" + puntaje + "-" + id;
    }
}