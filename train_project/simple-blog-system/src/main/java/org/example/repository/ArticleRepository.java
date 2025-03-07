package org.example.repository;

import org.example.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Page<Article> findByUserId(Long userId, Pageable pageable);
}
