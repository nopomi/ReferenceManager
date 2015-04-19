
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.domain.ArticleReference;
import wad.service.ReferenceService;

@Controller
@RequestMapping("article")
public class ArticleController {
    
    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(method = RequestMethod.POST)
    public String addArticle(@ModelAttribute ArticleReference article) {
        referenceService.addArticle(article);
        return "redirect:/references";
    }
}
