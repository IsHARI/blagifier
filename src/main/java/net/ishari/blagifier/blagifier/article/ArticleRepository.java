package net.ishari.blagifier.blagifier.article;

import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findBySlug(String slug);
}
