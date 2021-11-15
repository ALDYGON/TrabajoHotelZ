package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Testimonio")
public class Tesimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "estado")
    private Integer estado;

    @OneToMany(mappedBy = "tieneTestimonio")
    private List<Cliente> clientes;

    public Tesimonio() {
    }

    public Tesimonio(long id, String contenido, Integer estado) {
        this.id = id;
        this.contenido = contenido;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
