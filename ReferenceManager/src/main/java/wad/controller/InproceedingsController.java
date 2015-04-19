
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.InproceedingsReference;
import wad.domain.ReferenceType;
import wad.service.ReferenceService;

@Controller
@RequestMapping("inproceedings")
public class InproceedingsController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.POST)
    public String addBook(@ModelAttribute InproceedingsReference inp) {
        inp.setType(ReferenceType.INPROCEEDINGS);
      //  referenceService.addInproceeding(inp);
        return "redirect:/references";
    }
    
}
