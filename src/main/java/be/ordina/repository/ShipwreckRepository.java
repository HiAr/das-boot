package be.ordina.repository;

import be.ordina.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
}
