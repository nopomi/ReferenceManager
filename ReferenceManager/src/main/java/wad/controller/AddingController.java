package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wad.service.ReferenceService;

@Controller
@RequestMapping("add")
public class AddingController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("references", referenceService.list());
        return "/WEB-INF/views/add.jsp";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@RequestParam String id, @RequestParam String reference) {
        referenceService.add(id, reference);
        return "redirect:/references";
    }


}
