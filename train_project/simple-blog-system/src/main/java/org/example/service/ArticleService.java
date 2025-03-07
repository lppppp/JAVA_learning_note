package org.example.service;

import org.example.entity.Article;
import org.example.entity.User;
import org.example.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article createArticle(User user, String title, String content) {
        Article article = new Article();
        article.setUser(user);
        article.setTitle(title);
        article.setContent(content);
        article.setCreateTime(LocalDateTime.now());
        return articleRepository.save(article);
    }

    public Page<Article> getArticlesByUser(Long userId, int page, int size) {
        return articleRepository.findByUserId(userId, PageRequest.of(page, size));
    }

    public Page<Article> getAllArticles(int page, int size) {
        return articleRepository.findAll(PageRequest.of(page, size));
    }
}