
package wad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.BookletReference;

public interface BookletRepository extends JpaRepository<BookletReference, Long> {
    List<BookletReference> findByLabel(String label);       
}
