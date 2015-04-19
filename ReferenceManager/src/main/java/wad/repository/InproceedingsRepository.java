
package wad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.InproceedingsReference;

public interface InproceedingsRepository extends JpaRepository<InproceedingsReference, Long> {
    
}
