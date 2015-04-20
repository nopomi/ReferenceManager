
package wad.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.InproceedingsReference;

public interface InproceedingsRepository extends JpaRepository<InproceedingsReference, Long> {
    List<InproceedingsReference> findByLabel(String label);
}
