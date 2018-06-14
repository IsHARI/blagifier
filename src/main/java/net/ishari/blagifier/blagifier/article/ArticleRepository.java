package net.ishari.blagifier.blagifier.article;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findBySlug(String slug);
    List<Article> findAllByOrderByDateCreatedDesc();
}
