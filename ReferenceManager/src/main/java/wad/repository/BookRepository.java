
package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.BookReference;

public interface BookRepository extends JpaRepository<BookReference, Long> {
    
}
