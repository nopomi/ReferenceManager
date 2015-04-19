package wad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
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
    public void addArticle(ArticleReference article) {
        referenceRepository.save(article);
    }
    
    @Transactional
    public void addBook(BookReference book) {
        referenceRepository.save(book);
    }
    
    @Transactional
    public void addInproceeding(InproceedingsReference inproceedings) {
        referenceRepository.save(inproceedings);
    }

}
