package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wad.service.ReferenceService;

@Controller
@RequestMapping("references")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("references", referenceService.list());
        return "/WEB-INF/views/references.jsp";
    }

}
