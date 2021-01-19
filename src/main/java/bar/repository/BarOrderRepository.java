package bar.repository;

import bar.model.BarOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarOrderRepository extends JpaRepository<BarOrder, Integer> {
}
