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
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.InproceedingsRepository;
import wad.service.ReferenceService;

public class BibCreator {


    public String createBibFile(ServletContext ctx, ReferenceService refService){
        FileWriter writer;
        String fileName = System.currentTimeMillis()+".bib";
        Parser parser = new Parser();
        try {
            writer = new FileWriter("tmp/"+fileName);
            for (BookReference bookRef : refService.listBooks()) {
                writer.append(parser.createBibTexString(bookRef));
            }
            for (ArticleReference articleRef : refService.listArticles()) {
                writer.append(parser.createBibTexString(articleRef));
            }
            for (InproceedingsReference inproceedingsRef : refService.listInproceedings()) {
                writer.append(parser.createBibTexString(inproceedingsRef));
            }
            for(BookletReference bletRef : refService.listBooklets()){
                writer.append(parser.createBibTexString(bletRef));
            }
            for(ConferenceReference conRef : refService.listConferences()){
                writer.append(parser.createBibTexString(conRef));
            }
            for(IncollectionReference icolRef : refService.listIncollection()){
                writer.append(parser.createBibTexString(icolRef));
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
