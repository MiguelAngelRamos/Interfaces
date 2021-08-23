package accesodatos;

public interface IAccesoDatos {
	// Debemos asignarle un valor ya que una interface no tiene constructores
	// Solo vamos a tener m�todos y todos estos m�todos van hacer abastractos.
	public static final int MAX_REGISTRO = 10;
	// int MAX_REGISTRO = 10
	// en automatico el compilador lo agrega como public abstract void insertar()
	void insertar();
	void listar();
	void actualizar();
	void eliminar();
	
	// el Concepto se llama implementar las clases que utlizan esta interfaz la implementan
}
