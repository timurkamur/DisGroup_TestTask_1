package com.example.disgroup_testtask_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disgroup_testtask_1.model.Product; // Замените на ваше имя пакета и модели

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
