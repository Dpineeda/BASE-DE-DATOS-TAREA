package umd.model;

import java.util.List;
import umd.dao.ClienteDao;
import umd.dao.EmpleadoDao;
import umd.dao.PuestoDao;

public class BaseDatos {


   //EJECUCION PARA LA TABLA CLIENTES 
public static void main(String[] args) {
    ClienteDao daoClientes = new ClienteDao();
    List<Cliente> cl = daoClientes.listarTodos();
 for (Cliente c : cl) {
    System.out.println(c.getNombre());
 }

Cliente cl1 = daoClientes.buscarporid(1 );
cl1.setNombre("VICTOR CHILE ");
if (daoClientes.actualizar(cl1)) {
   System.out.println("Cliente actualizado correctamente");
}   

   {
Cliente cl2 = daoClientes.buscarporid(2 );
cl2.setNombre("ROBERTITO");
if (daoClientes.actualizar(cl2)) {
   System.out.println("Cliente actualizado correctamente x1 ");
      }
   }

//EJECUCION PARA TABLA EMPLEADOS 

EmpleadoDao daoEmpleados = new EmpleadoDao();
    List<Empleado> e1 = daoEmpleados.listarTodos();
 for (Empleado c : e1) {
    System.out.println(c.getNombre());
 }

Empleado em1 = daoEmpleados.buscarporid(1 );
em1.setNombre("VICTOR CHILE ");
if (daoEmpleados.actualizar(em1)) {
   System.out.println("Empleado actualizado correctamente");
}   

   {
Empleado em2 = daoEmpleados.buscarporid(2 );
em2.setNombre("ROBERTITO");
if (daoEmpleados.actualizar(em2)) {
   System.out.println("Empleado actualizado correctamente x2 ");
      }
   }

//EJECUCION PARA TABLA PUESTO

PuestoDao daoPuesto = new PuestoDao();
    List<Puesto> p1 = daoPuesto.listarTodos();
 for (Puesto c : p1) {
    System.out.println(c.getNombre());
 }

Puesto pu1 = daoPuesto.buscarporid(1 );
pu1.setNombre("Ingeniero civil");
if (daoPuesto.actualizar(pu1)) {
   System.out.println("Puesto actualizado correctamente");
}   

   {
Puesto pu2 = daoPuesto.buscarporid(2 );
pu2.setNombre("Ingeniero Industrial");
if (daoPuesto.actualizar(pu2)) {
   System.out.println("Puesto actualizado correctamente x3 ");
      }
   }





}


} 