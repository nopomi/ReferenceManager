
package wad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.ArticleReference;

public interface ArticleRepository extends JpaRepository<ArticleReference, Long> {
    
}
