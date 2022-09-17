package ku.cs.restaurant.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_GEN")
    @SequenceGenerator(name = "ORDER_GEN", sequenceName = "ORDER_SEQ")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    private int quantity;
}
