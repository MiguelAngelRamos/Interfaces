package accesodatos;

public class ImplementacionMysql implements IAccesoDatos{

	// Obligamos a implemtar los metodos a los que utilizen nuestra intefaz
	// sino lo deseas implementar deberias definir esta clase como abstracta.
	
	@Override
	public void insertar() {
		System.out.println("Insertar desde MYSQL");
		System.out.println(MAX_REGISTRO);
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println("Listar desde MYSQL");
		
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("Actualizar desde MYSQL");
		
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Eliminar desde MYSQL");
		
		
	}

}
