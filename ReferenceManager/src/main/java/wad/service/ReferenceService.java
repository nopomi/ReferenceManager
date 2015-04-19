package wad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.InproceedingsRepository;

@Service
public class ReferenceService {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private InproceedingsRepository inproceedingsRepository;
    @Autowired
    private BookRepository bookRepository;
//
//    public Iterable<Reference> list() {
//        return null;
//    }
//
//    @Transactional
//    public void addArticle(ArticleReference article) {
//        referenceRepository.save(article);
//    }
//
//    @Transactional
//    public void addBook(BookReference book) {
//        referenceRepository.save(book);
//    }
//
//    @Transactional
//    public void addInproceeding(InproceedingsReference inproceedings) {
//        referenceRepository.save(inproceedings);
//    }

}
