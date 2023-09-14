package com.codewithrohit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrohit.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
