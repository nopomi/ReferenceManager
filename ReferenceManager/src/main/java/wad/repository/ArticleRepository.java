
package wad.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.ArticleReference;

public interface ArticleRepository extends JpaRepository<ArticleReference, Long> {
    List<ArticleReference> findByLabel(String label);
}
