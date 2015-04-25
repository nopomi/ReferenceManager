
package wad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.IncollectionReference;

public interface IncollectionRepository extends JpaRepository<IncollectionReference, Long> {
    List<IncollectionReference> findByLabel(String label);
}
