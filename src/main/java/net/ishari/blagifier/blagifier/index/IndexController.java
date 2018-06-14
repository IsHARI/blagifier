package net.ishari.blagifier.blagifier.index;

import net.ishari.blagifier.blagifier.article.Article;
import net.ishari.blagifier.blagifier.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    private final ArticleRepository articleRepository;

    @GetMapping
    public String articleDisplay(Model model) {
        List<Article> articleList = articleRepository.findAllByOrderByDateCreatedDesc();
        model.addAttribute(articleList);
        return "main-page";
    }

    @Autowired
    public IndexController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
}
