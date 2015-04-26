
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.ConferenceReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("conference")
public class ConferenceController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.POST)
    public String addConference(@ModelAttribute ConferenceReference cr) {
        referenceService.addConference(cr);
        return "redirect:/references";
    }   
}
