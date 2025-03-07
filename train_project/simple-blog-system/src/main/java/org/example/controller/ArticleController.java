package org.example.controller;

import org.example.entity.Article;
import org.example.entity.User;
import org.example.service.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/articles")
    public ResponseEntity<Article> createArticle(@RequestParam Long userId,
                                                 @RequestParam String title,
                                                 @RequestParam String content) {
        User user = new User(); // 假设从会话或认证中获取，此处简化
        user.setId(userId);
        return ResponseEntity.ok(articleService.createArticle(user, title, content));
    }

    @GetMapping("/articles")
    public ResponseEntity<Page<Article>> getAllArticles(@RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(articleService.getAllArticles(page, size));
    }
}