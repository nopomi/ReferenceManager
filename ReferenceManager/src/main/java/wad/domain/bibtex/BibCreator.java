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
import wad.domain.Reference;
import wad.service.ReferenceService;

public class BibCreator {

    @Autowired
    private ReferenceService refService;
    @Autowired
    private Parser parser;

    public String createBibFile() {
        Iterable<Reference> references = refService.list();
        PrintWriter writer;
        String fileName = System.currentTimeMillis()+".bib";
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            for (Reference reference : references) {
                writer.println(parser.createBibTexString(reference));
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found, please check the input");
        } catch (UnsupportedEncodingException u) {
            System.out.println("Character format error, how can this happen?");
        }
        return fileName;
    }

}
