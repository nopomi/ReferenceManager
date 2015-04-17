package wad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.domain.Reference;
import wad.repository.ReferenceRepository;

@Service
public class ReferenceService {

    @Autowired
    private ReferenceRepository referenceRepository;

    public Iterable<Reference> list() {
        return referenceRepository.findAll();
    }

    @Transactional
    public void add(String id, String reference) {
        Reference ref = new Reference();
// pitää koodata uudelleen vastaamaan sovelluslogiikan muutoksia
//        ref.setRefId(id);
//        ref.setReference(reference);
        referenceRepository.save(ref);
    }

}
