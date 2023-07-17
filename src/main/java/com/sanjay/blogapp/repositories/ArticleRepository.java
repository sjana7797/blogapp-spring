package com.sanjay.blogapp.repositories;

import com.sanjay.blogapp.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
