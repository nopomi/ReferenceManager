
package rm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import rm.service.ReferenceService;

@Controller
public class ReferenceController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("reference", referenceService.list());
        return "/WEB-INF/views/movies.jsp";
    }
    
    @RequestMapping(method = RequestMethod.POST) 
    public String add(@RequestParam String text) {
        referenceService.add(text);
        return "redirect:/references";
    }
}
