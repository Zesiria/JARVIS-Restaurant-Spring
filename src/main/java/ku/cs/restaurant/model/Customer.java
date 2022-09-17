package ku.cs.restaurant.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_GEN")
    @SequenceGenerator(name = "CUSTOMER_GEN", sequenceName = "CUSTOMER_SEQ")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "desk_id")
    private Desk desk;

    private int quantity;

    @OneToMany
    private List<Order> order;
}
