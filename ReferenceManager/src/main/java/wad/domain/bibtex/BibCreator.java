package wad.domain.bibtex;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.InproceedingsRepository;
import wad.service.ReferenceService;

public class BibCreator {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private InproceedingsRepository inproceedingsRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private Parser parser;

    public String createBibFile() {
        if(articleRepository==null){
            return System.currentTimeMillis()+".bib";
        }
        Iterable<ArticleReference> articleRefs = articleRepository.findAll();
        Iterable<InproceedingsReference> inproceedingsRefs = inproceedingsRepository.findAll();
        Iterable<BookReference> bookRefs = bookRepository.findAll();
        PrintWriter writer;
        String fileName = System.currentTimeMillis()+".bib";
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            for (BookReference bookRef : bookRefs) {
                writer.println(parser.createBibTexString(bookRef));
            }
            for (ArticleReference articleRef : articleRefs) {
                writer.println(parser.createBibTexString(articleRef));
            }
            for (InproceedingsReference inproceedingsRef : inproceedingsRefs) {
                writer.println(parser.createBibTexString(inproceedingsRef));
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found, please check the input");
        } catch (UnsupportedEncodingException u) {
            System.out.println("Character format error, how can this happen?");
        }
        return fileName;
    }

}
