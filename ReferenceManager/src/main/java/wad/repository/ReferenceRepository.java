package wad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Reference;

public interface ReferenceRepository extends JpaRepository<Reference, Long> {
    
}
