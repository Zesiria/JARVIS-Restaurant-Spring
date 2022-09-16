package ku.cs.restaurant.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_generator")
    @SequenceGenerator(name="food_generator", sequenceName = "food_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;
    private String name;
    private String type;
    private int quantity;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
