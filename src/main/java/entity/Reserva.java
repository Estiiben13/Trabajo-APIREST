package entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
public class Reserva {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Date fecha;

    private Time hora;

    private String estado = "PENDIENTE";

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @NotNull
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    @NotNull
    private Servicio servicio;
}
