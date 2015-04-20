
package wad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.BookReference;

public interface BookRepository extends JpaRepository<BookReference, Long> {
    List<BookReference> findByLabel(String label);
}
