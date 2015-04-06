
package rm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rm.domain.Reference;
import rm.repository.ReferenceRepository;

@Service
public class ReferenceService {
    
    @Autowired
    private ReferenceRepository referenceRepository;
    
    public Iterable<Reference> list() {
        return referenceRepository.findAll();
    }
    
    public void add(String text) {
        Reference r = new Reference();
        r.setText(text);
        referenceRepository.save(r);
    }
}
