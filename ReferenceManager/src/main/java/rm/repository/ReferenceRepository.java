
package rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rm.domain.Reference;

public interface ReferenceRepository extends JpaRepository<Reference, Long> {
    
}
