package wad.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wad.domain.InproceedingsReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("inproceedings")
public class InproceedingsController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute InproceedingsReference inpr, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Fields marked with '*' are mandatory");
            return "redirect:/references";
        }

        if (referenceService.labelExists(inpr.getLabel())) {
            redirectAttributes.addFlashAttribute("message", "Label already exists, pick a new one");
            return "redirect:/references";
        }

        referenceService.addInproceeding(inpr);
        return "redirect:/references";
    }

    @RequestMapping(value = "/{label}/update", method = RequestMethod.POST)
    public String updateInproceedings(RedirectAttributes redirectAttributes, @Valid @ModelAttribute InproceedingsReference iRef, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Mandatory fields cannot be empty");
            return "redirect:/references/"+iRef.getLabel();
        }
        referenceService.replaceInproceedingsReference(iRef);
        return "redirect:/references/"+iRef.getLabel();
    }

}
