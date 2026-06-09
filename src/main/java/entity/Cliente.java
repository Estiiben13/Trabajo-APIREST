package entity;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nombre;

    @Column
    private String correo;

    @Column
    private String telefono;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private java.util.List<Reserva> reservas;
}
