package wad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.BookletReference;
import wad.domain.ConferenceReference;
import wad.domain.IncollectionReference;
import wad.domain.InproceedingsReference;
import wad.domain.ReferenceType;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.BookletRepository;
import wad.repository.ConferenceRepository;
import wad.repository.IncollectionRepository;
import wad.repository.InproceedingsRepository;

@Service
public class ReferenceService {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private InproceedingsRepository inproceedingsRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ConferenceRepository conferenceRepository;
    @Autowired
    private IncollectionRepository incollectionRepository;
    @Autowired
    private BookletRepository bookletRepository;

    public Iterable<ArticleReference> listArticles() {
        return articleRepository.findAll();
    }

    public Iterable<BookReference> listBooks() {
        return bookRepository.findAll();
    }

    public Iterable<InproceedingsReference> listInproceedings() {
        return inproceedingsRepository.findAll();
    }

    public Iterable<ConferenceReference> listConferences() {
        return conferenceRepository.findAll();
    }

    public Iterable<IncollectionReference> listIncollection() {
        return incollectionRepository.findAll();
    }

    public Iterable<BookletReference> listBooklets() {
        return bookletRepository.findAll();
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

    @Transactional
    public void addConference(ConferenceReference cr) {
        cr.setType(ReferenceType.CONFERENCE);
        conferenceRepository.save(cr);
    }

    @Transactional
    public void addIncollection(IncollectionReference ir) {
        ir.setType(ReferenceType.INCOLLECTION);
        incollectionRepository.save(ir);
    }

    @Transactional
    public void addBooklet(BookletReference br) {
        br.setType(ReferenceType.BOOKLET);
        bookletRepository.save(br);
    }

    public boolean labelExists(String label) {
        List<ArticleReference> aList = articleRepository.findByLabel(label);
        List<BookReference> bList = bookRepository.findByLabel(label);
        List<InproceedingsReference> iList = inproceedingsRepository.findByLabel(label);
        List<ConferenceReference> cList = conferenceRepository.findByLabel(label);
        List<BookletReference> bookletList = bookletRepository.findByLabel(label);
        List<IncollectionReference> incolList = incollectionRepository.findByLabel(label);
        if (cList.isEmpty() && bookletList.isEmpty() && incolList.isEmpty()) {
            return !(aList.isEmpty() && bList.isEmpty() && iList.isEmpty());
        }
        return true;
    }

    @Transactional
    public void replaceArticleReference(ArticleReference reference) {
        deleteReference(reference.getLabel());
        addArticle(reference);
    }

    @Transactional
    public void replaceBookReference(BookReference reference) {
        deleteReference(reference.getLabel());
        addBook(reference);
    }

    @Transactional
    public void replaceInproceedingsReference(InproceedingsReference reference) {
        deleteReference(reference.getLabel());
        addInproceeding(reference);
    }

    @Transactional
    public void replaceConferenceReference(ConferenceReference reference) {
        deleteReference(reference.getLabel());
        addConference(reference);
    }

    @Transactional
    public void replaceIncollectionReference(IncollectionReference reference){
        deleteReference(reference.getLabel());
        addIncollection(reference);
    }
    
    @Transactional
    public void replaceBookletReference(BookletReference reference){
        deleteReference(reference.getLabel());
        addBooklet(reference);
    }
    
    @Transactional
    public void deleteReference(String label) {

        if (!articleRepository.findByLabel(label).isEmpty()) {
            articleRepository.delete(articleRepository.findByLabel(label).get(0));
        } else if (!bookRepository.findByLabel(label).isEmpty()) {
            bookRepository.delete(bookRepository.findByLabel(label).get(0));
        } else if (!inproceedingsRepository.findByLabel(label).isEmpty()) {
            inproceedingsRepository.delete(inproceedingsRepository.findByLabel(label).get(0));
        } else if (!conferenceRepository.findByLabel(label).isEmpty()) {
            conferenceRepository.delete(conferenceRepository.findByLabel(label).get(0));
        } else if (!bookletRepository.findByLabel(label).isEmpty()) {
            bookletRepository.delete(bookletRepository.findByLabel(label).get(0));
        } else if (!incollectionRepository.findByLabel(label).isEmpty()) {
            incollectionRepository.delete(incollectionRepository.findByLabel(label).get(0));
        }
    }

}
