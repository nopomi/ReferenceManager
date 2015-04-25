package wad.service;

import java.util.List;
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

    public boolean labelExists(String label) {
        List<ArticleReference> aList = articleRepository.findByLabel(label);
        List<BookReference> bList = bookRepository.findByLabel(label);
        List<InproceedingsReference> iList = inproceedingsRepository.findByLabel(label);

        return !(aList.isEmpty() && bList.isEmpty() && iList.isEmpty());
    }
    
    @Transactional
    public void replaceArticleReference(ArticleReference reference){
        deleteReference(reference.getLabel());
        addArticle(reference);
    }
    
    @Transactional
    public void replaceBookReference(BookReference reference){
        deleteReference(reference.getLabel());
        addBook(reference);
    }
    
    @Transactional
    public void replaceInproceedingsReference(InproceedingsReference reference){
        deleteReference(reference.getLabel());
        addInproceeding(reference);
    }
    
    @Transactional
    public void deleteReference(String label){
        List<ArticleReference> aList = articleRepository.findByLabel(label);
        List<BookReference> bList = bookRepository.findByLabel(label);
        List<InproceedingsReference> iList = inproceedingsRepository.findByLabel(label);
        
        if(!aList.isEmpty()){
            articleRepository.delete(aList.get(0));
        } else if (!bList.isEmpty()){
            bookRepository.delete(bList.get(0));
        } else if (!iList.isEmpty()){
            inproceedingsRepository.delete(iList.get(0));
        }
    }

}
