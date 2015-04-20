package wad.domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.InproceedingsRepository;
import wad.service.ReferenceService;

public class BibCreator {


    public String createBibFile(ServletContext ctx, Iterable<ArticleReference> articleRefs, Iterable<InproceedingsReference> inproceedingsRefs, Iterable<BookReference> bookRefs){
        FileWriter writer;
        String fileName = System.currentTimeMillis()+".bib";
        String path = "";
        Parser parser = new Parser();
        try {
            path = ctx.getRealPath(fileName);
            writer = new FileWriter(path);
            for (BookReference bookRef : bookRefs) {
                writer.append(parser.createBibTexString(bookRef));
            }
            for (ArticleReference articleRef : articleRefs) {
                writer.append(parser.createBibTexString(articleRef));
            }
            for (InproceedingsReference inproceedingsRef : inproceedingsRefs) {
                writer.append(parser.createBibTexString(inproceedingsRef));
            }
            writer.close();
        } catch (FileNotFoundException f) {
            System.out.println("File not found, please check the input");
        } catch (UnsupportedEncodingException u) {
            System.out.println("Character format error, how can this happen?");
        } catch (IOException i){
            System.out.println("File creation did not work.");
        }
        return fileName;
    }

}
