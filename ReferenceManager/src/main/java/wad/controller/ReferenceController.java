package wad.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.bibtex.BibCreator;
import wad.service.ReferenceService;

@Controller
@RequestMapping("references")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("articles", referenceService.listArticles());
        model.addAttribute("books", referenceService.listBooks());
        model.addAttribute("inps", referenceService.listInproceedings());
        return "/WEB-INF/views/references.jsp";
    }
    
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void getBibtex(HttpServletResponse response) throws FileNotFoundException, IOException {
        BibCreator bC = new BibCreator();
        String filename = bC.createBibFile();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }
 
        FileInputStream fileInputStream = new FileInputStream(file);
        IOUtils.copy(fileInputStream, response.getOutputStream());
        response.flushBuffer();
    }
}
