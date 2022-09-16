package ku.cs.restaurant.model;

import javax.persistence.*;

@Entity
public class Desk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "desk_generator")
    @SequenceGenerator(name="desk_generator", sequenceName = "desk_seq")
    @Column(name = "id", updatable = false, nullable = false)

    private Integer id;
    private int size;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
