
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.IncollectionReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("incollection")
public class IncollectionController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.POST)
    public String addIncollection(@ModelAttribute IncollectionReference ir) {
        referenceService.addIncollection(ir);
        return "redirect:/references";
    }    
}

