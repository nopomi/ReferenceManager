
package wad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.ConferenceReference;

public interface ConferenceRepository extends JpaRepository<ConferenceReference, Long> {
    List<ConferenceReference> findByLabel(String label);   
}