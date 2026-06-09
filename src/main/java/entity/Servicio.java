package entity;

import jakarta.persistence.*;

@Entity
public class Servicio {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private float precioF;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private java.util.List<Reserva> reservas;
}
