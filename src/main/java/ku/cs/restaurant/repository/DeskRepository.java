package ku.cs.restaurant.repository;

import ku.cs.restaurant.model.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desk,Integer> {
}
