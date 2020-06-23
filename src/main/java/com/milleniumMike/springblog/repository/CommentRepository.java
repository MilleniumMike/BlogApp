package com.milleniumMike.springblog.repository;

import com.milleniumMike.springblog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
