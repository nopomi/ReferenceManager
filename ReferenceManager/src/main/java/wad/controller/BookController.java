package wad.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wad.domain.BookReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute BookReference book, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Fields marked with '*' are mandatory");
            return "redirect:/references";
        }

        if (referenceService.labelExists(book.getLabel())) {
            redirectAttributes.addFlashAttribute("message", "Label already exists, pick a new one");
            return "redirect:/references";
        }

        referenceService.addBook(book);
        redirectAttributes.addFlashAttribute("messageAdded", "Reference added successfully");
        return "redirect:/references";
    }

    @RequestMapping(value = "/{label}/update", method = RequestMethod.POST)
    public String updateBook(RedirectAttributes redirectAttributes, @Valid @ModelAttribute BookReference bRef, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "Mandatory fields cannot be empty");
            return "redirect:/references/" + bRef.getLabel();
        }
        referenceService.replaceBookReference(bRef);
        redirectAttributes.addFlashAttribute("messageUpdated", "Reference updated");
        return "redirect:/references/" + bRef.getLabel();
    }

}
