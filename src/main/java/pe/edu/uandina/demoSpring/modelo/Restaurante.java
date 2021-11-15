package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Restaurante")
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nomPlato")
    private String nomPLato;
    @Column(name = "precioPlato")
    private float precioPlato;
    @Column(name = "foto")
    private String foto;

    //    pertenece a un detalleReserva
    @OneToMany(mappedBy = "tieneRestaurante")
    private List<DetalleReserva> detalleReservas;

    public Restaurante() {
    }

    public Restaurante(long id, String nomPLato, float precioPlato, String foto) {
        this.id = id;
        this.nomPLato = nomPLato;
        this.precioPlato = precioPlato;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPLato() {
        return nomPLato;
    }

    public void setNomPLato(String nomPLato) {
        this.nomPLato = nomPLato;
    }

    public float getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(float precioPlato) {
        this.precioPlato = precioPlato;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
