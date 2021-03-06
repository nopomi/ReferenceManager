package wad.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wad.domain.ConferenceReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("conference")
public class ConferenceController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.POST)
    public String addConference(RedirectAttributes redirectAttributes, @Valid @ModelAttribute ConferenceReference reference, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Fields marked with '*' are mandatory");
            return "redirect:/references";
        }

        if (referenceService.labelExists(reference.getLabel())) {
            redirectAttributes.addFlashAttribute("message", "Label already exists, pick a new one");
            return "redirect:/references";
        }

        referenceService.addConference(reference);
        redirectAttributes.addFlashAttribute("messageAdded", "Reference added successfully");
        return "redirect:/references/";
    }

    @RequestMapping(value = "/{label}/update", method = RequestMethod.POST)
    public String updateConference(RedirectAttributes redirectAttributes, @Valid @ModelAttribute ConferenceReference reference, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Mandatory fields cannot be empty");
            return "redirect:/references/" + reference.getLabel();
        }
        referenceService.replaceConferenceReference(reference);
        redirectAttributes.addFlashAttribute("messageUpdated", "Reference updated");
        return "redirect:/references/" + reference.getLabel();
    }
}
