package net.ishari.blagifier.blagifier.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {
    private final ArticleRepository articleRepository;

    @GetMapping("/{slug}")
    public String articleDisplay(@PathVariable("slug")String slug, Model model) {
        Article article = articleRepository.findBySlug(slug);
        model.addAttribute(article);
        return "article-display";
    }

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
}
