package Repository;

import com.crni99.qrcodegenerator.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Tickets, String> {

}