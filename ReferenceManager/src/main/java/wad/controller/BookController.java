
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.BookReference;
import wad.domain.ReferenceType;
import wad.service.ReferenceService;

@Controller
@RequestMapping("book")
public class BookController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.POST)
    public String addBook(@ModelAttribute BookReference book) {
        book.setType(ReferenceType.BOOK);
        referenceService.addBook(book);
        return "redirect:/references";
    }
    
}
