package wad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.domain.ReferenceType;
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
    
    public Iterable<ArticleReference> listArticles() {
        return articleRepository.findAll();
    }
    
    public Iterable<BookReference> listBooks() {
        return bookRepository.findAll();
    }
        
    public Iterable<InproceedingsReference> listInproceedings() {
        return inproceedingsRepository.findAll();
    }
    
    @Transactional
    public void addArticle(ArticleReference article) {
        article.setType(ReferenceType.ARTICLE);
        articleRepository.save(article);
    }

    
    @Transactional
    public void addBook(BookReference book) {
        book.setType(ReferenceType.BOOK);
        bookRepository.save(book);
    }
    
    @Transactional
    public void addInproceeding(InproceedingsReference inproceedings) {
        inproceedings.setType(ReferenceType.INPROCEEDINGS);
        inproceedingsRepository.save(inproceedings);
    }
}
