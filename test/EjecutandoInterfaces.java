package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMysql;
import accesodatos.ImplementacionOracle;

public class EjecutandoInterfaces {
	public static void main(String[] args) {
		// Variable de tipo interfaces
		// poo uno de lo sobjetivos es hacer codigo mas generico posible
		// estos tipos interfaces pueden apuntar a objetos que hayan impleado estas interfaces
		
		// IAccesoDatos datos = new IAccesoDatos(); Esto no es posible una interface .
		
		// clases abstractas abstrayendo caracteristicas en comun
		// interfaces comportamiento en comun, funcionalidad y no caracteristicas.
		
		IAccesoDatos datos = new ImplementacionMysql();
		// Aplicamos polimorfismo
		// datos.insertar();
		imprimir(datos);
		
		datos = new ImplementacionOracle();
		// datos.insertar();
		imprimir(datos);
		
		
	}
	
	public static void imprimir(IAccesoDatos datos) {
		datos.insertar();
	}
}
