package gestorDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/** Mediante esta clase se implementan los métodos para la creación de base de datos, creación de tablas e inserción de datos
 * @author Pablo Echeverría
 *
 */

public class sqliteMetodos {
	
	Connection conn = null;
	Statement stmt = null;
	String nombreTabla;
	String nombreP;
	String apellidoP;
	int edadP;
	int numContacto;
	int codigoIdentP;
	String usuarioC;
	String usuarioE;
	int contraseniaC;
	int contraseniaE;
	int saldo;
	boolean esVIP;
	int rangoE;
	String nombre;
	String tipo;
	int codigoP;
	int numIngre;
	int precio;
	int cantidad;
	String nombreI;
	String descI;
	int codigoI;
	
// Metodos de creación de la Base de Datos

/**
 * Creación de la Base de Datos
 */
	
	public void crearDataBase(){
		
		try{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:Tienda.db");
			System.out.println("Base de datos creada correctamente");
			
		}catch(Exception e){
			System.out.println("Error en la creación de la base de datos");
		}

	}


// Metodos de creación de las diferentes tablas
	
/** Método para crear la tabla de los Clientes
 * @param nombreTabla el nombre de la tabla
 * @throws SQLException 
 */
	
	public void crearTablaCliente(String nombreTabla) throws SQLException{
		this.nombreTabla=nombreTabla;
		
		try{
			stmt = conn.createStatement();
			String sql = "CREATE TABLE "+nombreTabla+" "+
					"(codigoIdentP integer PRIMARY KEY NOT NULL, "+
					" nombreP text NOT NULL, "+
					" apellidoP text NOT NULL, "+
					" edadP integer NOT NULL, "+
					" numContacto integer NOT NULL, "+
					" usuarioC text NOT NULL, "+
					" contraseniaC integer NOT NULL, "+
					" saldo integer NOT NULL, "+
					" esVIP boolean NOT NULL CHECK(esVIP IN (0,1))";
				stmt.execute(sql);
				stmt.close();
				conn.close();
			System.out.println("Tabla CLIENTE creada correctamente");
			
		}catch(Exception e){
			System.out.println("Error en la creación de la tabla CLIENTE");
		}
	}
	

/**	Método para crear la tabla de los Empleados
 * @param nombreTabla el nombre de la tabla
 * @throws SQLException
 */
	
	public void crearTablaEmpleado(String nombreTabla) throws SQLException{
		this.nombreTabla=nombreTabla;
		
		try{
			stmt = conn.createStatement();
			String sql = "CREATE TABLE "+nombreTabla+" "+
					"(codigoIdentP integer PRIMARY KEY NOT NULL, "+
					" nombreP text NOT NULL, "+
					" apellidoP text NOT NULL, "+
					" edadP integer NOT NULL, "+
					" numContacto integer NOT NULL, "+
					" usuarioE text NOT NULL, "+
					" contraseniaE integer NOT NULL, "+
					" rangoE text NOT NULL)";
				stmt.execute(sql);
				stmt.close();
				conn.close();
			System.out.println("Tabla EMPLEADO creada correctamente");
			
		}catch(Exception e){
			System.out.println("Error en la creación de la tabla EMPLEADO");
		}
	}
	
/**	Método para crear la tabla de los Productos
 * @param nombreTabla el nombre de la tabla
 * @throws SQLException
 */
	
	public void crearTablaProducto(String nombreTabla) throws SQLException{
		this.nombreTabla=nombreTabla;
		
		try{
			stmt = conn.createStatement();
			String sql = "CREATE TABLE "+nombreTabla+" "+
					"(codigoP integer PRIMARY KEY NOT NULL, "+
					" nombre text NOT NULL, "+
					" tipo text NOT NULL, "+
					" numIngre integer NOT NULL, "+
					" precio integer NOT NULL, "+
					" cantidad integer NOT NULL)";
				stmt.execute(sql);
				stmt.close();
				conn.close();
			System.out.println("Tabla PRODUCTO creada correctamente");
			
		}catch(Exception e){
			System.out.println("Error en la creación de la tabla PRODUCTO");
		}
	}
	
/** Método para crear la tabla de los Ingredientes
 * @param nombreTabla el nombre de la tabla
 * @throws SQLException
 */
	
	public void crearTablaIngredientes(String nombreTabla) throws SQLException{
		this.nombreTabla=nombreTabla;
		
		try{
			stmt = conn.createStatement();
			String sql = "CREATE TABLE "+nombreTabla+" "+
					"(codigoI integer PRIMARY KEY NOT NULL, "+
					" nombreI text NOT NULL, "+
					" descI text NOT NULL)";
				stmt.execute(sql);
				stmt.close();
				conn.close();
			System.out.println("Tabla INGREDIENTES creada correctamente");

		}catch(Exception e){
			System.out.println("Error en la creación de la tabla INGREDIENTES");
		}
	}


// Metodos de inserción de los datos 
	
/** Método para insertar datos en la tabla CLIENTE
 * Mismos parametros definidos en la clase de Cliente
 * @param codigoIdentP
 * @param nombreP
 * @param apellidoP
 * @param edadP
 * @param numContacto
 * @param usuarioC
 * @param contraseniaC
 * @param saldo
 * @param esVIP
 * @throws SQLException
 */
	
	public void insertarDatosCliente(int codigoIdentP, String nombreP, String apellidoP, int 
			edadP, int numContacto, String usuarioC, int contraseniaC, int saldo, boolean esVIP)throws SQLException{
		this.codigoIdentP=codigoIdentP;
		this.nombreP = nombreP;
		this.apellidoP = apellidoP;
		this.edadP = edadP;
		this.numContacto = numContacto;
		this.usuarioC = usuarioC;
		this.contraseniaC = contraseniaC;
		this.saldo = saldo;
		this.esVIP = esVIP;
		
		String sqlInsert="INSERT INTO "+nombreTabla+"(codigoIdentP, nombreP, apellidoP, "
				+ "edadP, numContacto, usuarioC, contraseniaC, saldo, esVIP) "+
				"VALUES("+codigoIdentP+",'"+nombreP+"','"+apellidoP+"','"+edadP+"','"+numContacto+"','"+usuarioC+"','"
				+contraseniaC+"','"+saldo+"','"+esVIP+"');";
		
		try{
			crearDataBase();
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlInsert);
			stmt.close();
			conn.close();
			System.out.println("Datos insertados en la tabla CLIENTE");
			
		}catch(Exception e){
			System.out.println("Error en la inserción de datos de la tabla CLIENTE");
		}
	
	}
	
	
/** Método para insertar datos en la tabla EMPLEADO
 * Mismos parametros definidos en la clase de Empleado 
 * @param codigoIdentP
 * @param nombreP
 * @param apellidoP
 * @param edadP
 * @param numContacto
 * @param usuarioE
 * @param contraseniaE
 * @param rangoE
 * @throws SQLException
 */
	
	public void insertarDatosEmpleado(int codigoIdentP, String nombreP, String apellidoP, int 
			edadP, int numContacto, String usuarioE, int contraseniaE, int rangoE)throws SQLException{
		this.codigoIdentP=codigoIdentP;
		this.nombreP = nombreP;
		this.apellidoP = apellidoP;
		this.edadP = edadP;
		this.numContacto = numContacto;
		this.usuarioE = usuarioE;
		this.contraseniaE = contraseniaE;
		this.rangoE = rangoE;
		
		String sqlInsert="INSERT INTO "+nombreTabla+"(codigoIdentP, nombreP, apellidoP, "
				+ "edadP, numContacto, usuarioE, contraseniaE, rangoE) "+
				"VALUES("+codigoIdentP+",'"+nombreP+"','"+apellidoP+"','"+edadP+"','"+numContacto+"','"+usuarioE+"','"
				+contraseniaE+"','"+rangoE+"');";
		
		try{
			crearDataBase();
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlInsert);
			stmt.close();
			conn.close();
			System.out.println("Datos insertados en la tabla EMPLEADO");
			
		}catch(Exception e){
			System.out.println("Error en la inserción de datos de la tabla EMPLEADO");
		}
	
	}
	
	
/** /** Método para insertar datos en la tabla PRODUCTO
 * Mismos parametros definidos en la clase de Producto
 * @param codigoP
 * @param nombre
 * @param tipo
 * @param numIngre
 * @param precio
 * @param cantidad
 * @throws SQLException
 */
	
	public void insertarDatosProducto(int codigoP, String nombre, String tipo, int numIngre, int precio,
			int cantidad)throws SQLException{
		this.codigoP = codigoP;
		this.nombre = nombre;
		this.tipo = tipo;
		this.numIngre = numIngre;
		this.precio = precio;
		this.cantidad = cantidad;
		
		String sqlInsert="INSERT INTO "+nombreTabla+"(codigoP, nombre, tipo, "
				+ "numIngre, precio, cantidad) "+
				"VALUES("+codigoP+",'"+nombre+"','"+tipo+"','"+numIngre+"','"+precio+"','"+cantidad+"');";
		
		try{
			crearDataBase();
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlInsert);
			stmt.close();
			conn.close();
			System.out.println("Datos insertados en la tabla PRODUCTO");
			
		}catch(Exception e){
			System.out.println("Error en la inserción de datos de la tabla PRODUCTO");
		}
	
	}
	
	
/** Método para insertar datos en la tabla INGREDIENTES
 * Mismos parametros definidos en la clase de Ingredientes
 * @param codigoI
 * @param nombreI
 * @param descI
 * @throws SQLException
 */
	
	public void insertarDatosIngredientes(int codigoI, String nombreI, String descI)throws SQLException{
		this.codigoI = codigoI;
		this.nombreI = nombreI;
		this.descI = descI;

		String sqlInsert="INSERT INTO "+nombreTabla+"(codigoI, nombreI, descI) "+
				"VALUES("+codigoI+",'"+nombreI+"','"+descI+"');";
		
		try{
			crearDataBase();
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlInsert);
			stmt.close();
			conn.close();
			System.out.println("Datos insertados en la tabla INGREDIENTES");
			
		}catch(Exception e){
			System.out.println("Error en la inserción de datos de la tabla INGREDIENTES");
		}
	
	}
	
}
