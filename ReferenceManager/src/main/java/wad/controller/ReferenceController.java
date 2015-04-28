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
import wad.domain.BookletReference;
import wad.domain.ConferenceReference;
import wad.domain.IncollectionReference;
import wad.repository.ArticleRepository;
import wad.repository.BookRepository;
import wad.repository.BookletRepository;
import wad.repository.ConferenceRepository;
import wad.repository.IncollectionRepository;
import wad.repository.InproceedingsRepository;
import wad.service.ReferenceService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    private ConferenceRepository conferenceRepository;

    @Autowired
    private IncollectionRepository incollectionRepository;

    @Autowired
    private BookletRepository bookletRepository;

    @Autowired
    private ServletContext ctx;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("articles", referenceService.listArticles());
        model.addAttribute("books", referenceService.listBooks());
        model.addAttribute("inps", referenceService.listInproceedings());
        model.addAttribute("conferences", referenceService.listConferences());
        model.addAttribute("incollections", referenceService.listIncollection());
        model.addAttribute("booklets", referenceService.listBooklets());
        return "/WEB-INF/views/references.jsp";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void getLogFile(HttpSession session, HttpServletResponse response) {
        try {
            BibCreator bC = new BibCreator();
            String filename = bC.createBibFile(ctx, referenceService);
            System.out.println(filename);
            File fileToDownload = new File("tmp/" + filename);
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
        List<InproceedingsReference> ipRefs = inproceedingsRepository.findByLabel(label);
        List<ConferenceReference> cRefs = conferenceRepository.findByLabel(label);
        List<IncollectionReference> icRefs = incollectionRepository.findByLabel(label);
        List<BookletReference> bookletRefs = bookletRepository.findByLabel(label);
        if (!aRefs.isEmpty()) {
            model.addAttribute("reference", aRefs.get(0));
        }
        if (!bRefs.isEmpty()) {
            model.addAttribute("reference", bRefs.get(0));
        }
        if (!ipRefs.isEmpty()) {
            model.addAttribute("reference", ipRefs.get(0));
        }
        if (!cRefs.isEmpty()) {
            model.addAttribute("reference", cRefs.get(0));
        }
        if (!icRefs.isEmpty()) {
            model.addAttribute("reference", icRefs.get(0));
        }
        if (!bookletRefs.isEmpty()) {
            model.addAttribute("reference", bookletRefs.get(0));
        }

        return "/WEB-INF/views/reference.jsp";
    }

    @RequestMapping(value = "/delete/{label}", method = RequestMethod.POST)
    public String delete(@PathVariable String label, RedirectAttributes redirectAttributes) {
        List<ArticleReference> aRefs = articleRepository.findByLabel(label);
        List<BookReference> bRefs = bookRepository.findByLabel(label);
        List<InproceedingsReference> ipRefs = inproceedingsRepository.findByLabel(label);
        List<ConferenceReference> cRefs = conferenceRepository.findByLabel(label);
        List<IncollectionReference> icRefs = incollectionRepository.findByLabel(label);
        List<BookletReference> bookletRefs = bookletRepository.findByLabel(label);

        if (!bRefs.isEmpty()) {
            bookRepository.delete(bRefs.get(0).getId());
        }
        if (!aRefs.isEmpty()) {
            articleRepository.delete(aRefs.get(0).getId());
        }
        if (!ipRefs.isEmpty()) {
            inproceedingsRepository.delete(ipRefs.get(0).getId());
        }

        if (!cRefs.isEmpty()) {
            conferenceRepository.delete(cRefs.get(0).getId());
        }
        if (!icRefs.isEmpty()) {
            incollectionRepository.delete(icRefs.get(0).getId());
        }
        if (!bookletRefs.isEmpty()) {
            bookletRepository.delete(bookletRefs.get(0).getId());
        }

        redirectAttributes.addFlashAttribute("messageAdded", "Reference " + label + " deleted");

        return "redirect:/references";

    }
}
