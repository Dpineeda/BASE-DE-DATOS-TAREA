package umd.model;
import java.time.LocalDate;

public class Empleado extends Persona {
    private int id_empleado;
    private int id_puesto;
    private LocalDate fecha_contratacion;

public Empleado(int id_empleado, String nombre, String apellidos, LocalDate fecha_contratacion, int id_puesto) {
    super(nombre, apellidos);
    this.id_empleado = id_empleado;
    this.id_puesto = id_puesto;
    this.fecha_contratacion = fecha_contratacion;
}

public int getIdEmpleado() {
    return id_empleado;
}

public void setIdEmpleado (int id_empleado) {
    this.id_empleado = id_empleado;
}

public int getIdPuesto () {
    return id_puesto;
}

public void setIdPuesto(int id_puesto) {
    this.id_puesto = id_puesto;
} 

public LocalDate getFechaContratacion() {
    return fecha_contratacion;
}

public void setFechaContratacion(LocalDate fecha_contratacion) {
    this.fecha_contratacion = fecha_contratacion;
}

}
