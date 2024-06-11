package Repository;

import com.crni99.qrcodegenerator.model.Partits;
import model.Partits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartitsRepository extends JpaRepository<Partits, Integer> {
    List<Partits> findAll();

    <T> ScopedValue<T> findById(int id);
}