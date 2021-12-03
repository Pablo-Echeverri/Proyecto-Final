package gestorDB;

import java.sql.SQLException;

/** Creación de las diferentes partes de la base de Datos
 * @author Pablo Echeverría
 *
 */

public class mainDB {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		sqliteMetodos TiendaDb = new sqliteMetodos();
		
// Creación de la base de datos
		
		TiendaDb.crearDataBase();
		
		
// Creación de las tablas
		
		TiendaDb.crearTablaCliente("CLIENTE");
		TiendaDb.crearTablaEmpleado("EMPLEADO");
		TiendaDb.crearTablaProducto("PRODUCTO");
		TiendaDb.crearTablaIngredientes("INGREDIENTES");
		
		
// Inserción de los datos en las tablas
		
		TiendaDb.insertarDatosCliente(1, "Javier", "Magallón", 43, 659235735, "JavierMag", 12345692, 150, false);
		TiendaDb.insertarDatosCliente(2, "Begoña", "Irizar", 21, 846274958, "BegoñaIri", 73823, 150, true);
		TiendaDb.insertarDatosCliente(3, "Maialen", "Jimenez", 56, 917366421, "MaialenJim", 111111111, 100, true);
		TiendaDb.insertarDatosCliente(4, "David", "Magallón", 25, 904728473, "DavidMag", 828391, 240, false);
		TiendaDb.insertarDatosCliente(5, "Pablo", "Díez", 18, 999183741, "PabloDiz", 982020, 75, true);
		TiendaDb.insertarDatosCliente(6, "Iñaki", "Santacana", 15, 123836284, "IñakiSant", 949237, 40, false);
		TiendaDb.insertarDatosCliente(7, "Cristina", "Ocina", 16, 248271522, "CristinaOc", 1123, 300, false);
		TiendaDb.insertarDatosCliente(8, "Nora", "Sanchez", 34, 892738438, "NoraSanc", 90283, 111, true);
		TiendaDb.insertarDatosCliente(9, "Maria Jose", "Farias", 39, 22397483, "MariJoseFar", 2348439, 134, false);
		TiendaDb.insertarDatosCliente(10, "Rafael", "Múgica", 40, 908009128, "RafaelMug", 3467221, 96, true);
		
		TiendaDb.insertarDatosEmpleado(1, "Gabriel", "Carro", 48, 259642492, "GabrielCar", 601109, 1);
		TiendaDb.insertarDatosEmpleado(2, "Belen", "Cañas", 21, 753777433, "BelenCa", 771398, 3);
		TiendaDb.insertarDatosEmpleado(3, "Maialen", "Arias", 46, 864587542, "MaialenAria", 648368, 1);
		TiendaDb.insertarDatosEmpleado(4, "Placido", "Marcos", 56, 468207517, "PlacidoMar", 573209, 1);
		TiendaDb.insertarDatosEmpleado(5, "Teresa", "Hinojosa", 24, 691484683, "TeresaHino", 386819, 3);
		TiendaDb.insertarDatosEmpleado(6, "Denis", "San-Martin", 56, 159127413, "DenisSan", 17527, 2);
		TiendaDb.insertarDatosEmpleado(7, "Guillem", "Montilla", 54, 100271799, "GuillemMon", 296362, 2);
		TiendaDb.insertarDatosEmpleado(8, "Constantin", "Redondo", 23, 315669709, "ConstantinRedo", 23565, 1);
		
		TiendaDb.insertarDatosProducto(1, "Luneta", "dulce", 5, 4, 50);
		TiendaDb.insertarDatosProducto(2, "Piruleta de Bubulubu", "dulce", 7, 5, 150);
		TiendaDb.insertarDatosProducto(3, "Bombones de Chocolate", "dulce", 5, 8, 23);
		TiendaDb.insertarDatosProducto(4, "Chicle Bola", "dulce", 6, 3, 56);
		TiendaDb.insertarDatosProducto(5, "Piruleta de Caramelo", "dulce", 3, 5, 87);
		TiendaDb.insertarDatosProducto(6, "Huevo de Chocolate", "dulce", 2, 9, 35);
		TiendaDb.insertarDatosProducto(7, "Pelon", "Chile", 6, 10, 12);
		TiendaDb.insertarDatosProducto(8, "Miguelito", "Chile", 7, 12, 10);
		TiendaDb.insertarDatosProducto(9, "Totis Enchilado", "Chile", 7, 7, 50);
		TiendaDb.insertarDatosProducto(10, "Miguelito En Polvo", "Chile", 3, 15, 65);
		TiendaDb.insertarDatosProducto(11, "Tarugos", "Chile", 4, 8, 23);
		TiendaDb.insertarDatosProducto(12, "Fritos", "Salado", 5, 5, 11);
		TiendaDb.insertarDatosProducto(13, "Palomitas", "Salado", 6, 5, 24);
		TiendaDb.insertarDatosProducto(14, "Nachos", "Salado", 3, 7, 65);
		TiendaDb.insertarDatosProducto(15, "Chetos", "Salado", 3, 8, 200);
		TiendaDb.insertarDatosProducto(16, "Cacahuate Salado", "Salado", 5, 15, 200);

		TiendaDb.insertarDatosIngredientes(1, "Azúcar", "Sacarosa o sucrosa");
		TiendaDb.insertarDatosIngredientes(2, "Cacao", "Theobroma cacao");
		TiendaDb.insertarDatosIngredientes(3, "Leche", "Secresión blanquecino");
		TiendaDb.insertarDatosIngredientes(4, "Mantequilla", "Emulsión");
		TiendaDb.insertarDatosIngredientes(5, "Fresa", "Planta fragaria");
		TiendaDb.insertarDatosIngredientes(6, "Limón", "Fruta citrus");
		TiendaDb.insertarDatosIngredientes(7, "Naranja", "Fruta cítrica");
		TiendaDb.insertarDatosIngredientes(8, "Menta", "Planta mentha");
		TiendaDb.insertarDatosIngredientes(9, "Harina", "Polvo fino del cereal molido");
		TiendaDb.insertarDatosIngredientes(10, "Sal", "Condimento cloruro sódico");
		TiendaDb.insertarDatosIngredientes(11, "Queso", "Alimento de maduración cuajada");
		TiendaDb.insertarDatosIngredientes(12, "Tomate", "Fruta solanum lycopersicum");
		TiendaDb.insertarDatosIngredientes(13, "Levadura", "Fungi  o fermento de los hongos");
		
		
// Borrado de los datos en las tablas
		
/**
 *  Un único ejemplo sobre el borrado, cambiaría el nombre de la tabla y el número de codigo dependiendo del dato 
 *  a borrar
 */
		
		TiendaDb.borrarDatos("Cliente", 1);
		

// Consulta de datos
		
/**
 * Un único ejemplo sobre la consulta de un dato de las tablas
 */
		
		TiendaDb.consultaDatos("Cliente");
		

// Actualización de los datos en las tablas

/**
 * Un único ejemplo sobre la actualización
 */
		
		TiendaDb.actualizarDatos("Ingredientes", 12, "nombreI"+"Jitomate");

	}

}
