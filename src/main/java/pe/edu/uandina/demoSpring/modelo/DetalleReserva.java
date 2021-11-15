package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DetalleReserva")
public class DetalleReserva<Testimonio> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ingreso")
    private String ingreso;
    @Column(name = "salida")
    private String salida;
    @Column(name = "precio")
    private float precio;
    @Column(name = "adelanto")
    private float adelanto;
    @Column(name = "dias")
    private Integer dias;

    //    pertenece a un cliente
    @OneToMany(mappedBy = "tieneDetalleReserva")
    private List<Cliente> clientes;

    //referencia de muchos a uno para tieneRestaurante
    @ManyToOne
    @JoinColumn(name = "tieneRestaurante", referencedColumnName = "id")
    private Testimonio tieneRestaurante;

    //referencia de muchos a uno para tieneHabitacion
    @ManyToOne
    @JoinColumn(name = "tieneHabitacion", referencedColumnName = "id")
    private Testimonio tieneHabitacion;

    public DetalleReserva() {
    }

    public DetalleReserva(long id, String ingreso, String salida, float precio, float adelanto, Integer dias) {
        this.id = id;
        this.ingreso = ingreso;
        this.salida = salida;
        this.precio = precio;
        this.adelanto = adelanto;
        this.dias = dias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(float adelanto) {
        this.adelanto = adelanto;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
