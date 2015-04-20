package wad.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.ArticleReference;
import wad.domain.BookReference;
import wad.domain.InproceedingsReference;
import wad.domain.BibCreator;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.InproceedingsRepository;
import wad.service.ReferenceService;

@Controller
@RequestMapping("references")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private InproceedingsRepository inproceedingsRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ServletContext ctx;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("articles", referenceService.listArticles());
        model.addAttribute("books", referenceService.listBooks());
        model.addAttribute("inps", referenceService.listInproceedings());
        return "/WEB-INF/views/references.jsp";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void getLogFile(HttpSession session, HttpServletResponse response) {
        try {
            BibCreator bC = new BibCreator();
            String filename = bC.createBibFile(ctx, referenceService.listArticles(), referenceService.listInproceedings(), referenceService.listBooks());
            File fileToDownload = new File(ctx.getRealPath(filename));
            InputStream inputStream = new FileInputStream(fileToDownload);
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment; filename=" + filename);
            IOUtils.copy(inputStream, response.getOutputStream());
            response.flushBuffer();
            inputStream.close();
        } catch (Exception e) {
            System.out.println("Request could not be completed at this moment. Please try again.");
        }
    }

    @RequestMapping(value = "/{label}", method = RequestMethod.GET)
    public String view(Model model, @PathVariable String label) {
        List<ArticleReference> aRefs = articleRepository.findByLabel(label);
        List<BookReference> bRefs = bookRepository.findByLabel(label);
        List<InproceedingsReference> iRefs = inproceedingsRepository.findByLabel(label);
        if (!aRefs.isEmpty()) {
            model.addAttribute("reference", aRefs.get(0));
            return "/WEB-INF/views/reference.jsp";
        } else if (!bRefs.isEmpty()) {
            model.addAttribute("reference", bRefs.get(0));
            return "/WEB-INF/views/reference.jsp";
        } else {
            model.addAttribute("reference", iRefs.get(0));
            return "/WEB-INF/views/reference.jsp";
        }
    }

}
