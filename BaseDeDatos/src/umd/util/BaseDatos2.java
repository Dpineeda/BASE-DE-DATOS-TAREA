import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDatos2 {
   public BaseDatos2() {
   }

   public static void main(String[] args) {
      System.out.println("Consulta a base de datos de empleados");
      String sqlSelect = "Select nombre, apellidos from empleados";
      ResultSet resultados = ConexionDB.ejecutarConsulta(sqlSelect);

      try {
         if (resultados != null) {
            System.out.println("Empleados registrados");

            while(resultados.next()) {
               String nombreempleado = resultados.getString ("nombre");
               String apellidoempleado = resultados.getString ("apellidos");
               System.out.println("- " + nombreempleado + " " + apellidoempleado);
            }
         }
      } catch (SQLException e) {
         System.err.println("Error al momento de realizar la conexión");
         e.printStackTrace();
      }
      ConexionDB.cerrarConexion();
   }
}
