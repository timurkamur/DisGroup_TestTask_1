package com.example.disgroup_testtask_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disgroup_testtask_1.model.Article; // Замените на ваше имя пакета и модели

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
