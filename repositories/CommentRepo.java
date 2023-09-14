package com.codewithrohit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrohit.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
