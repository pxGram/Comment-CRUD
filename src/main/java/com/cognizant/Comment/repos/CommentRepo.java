package com.cognizant.Comment.repos;

import com.cognizant.Comment.models.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
    Page<Comment> findByPostId(long postId, Pageable pageable);
}
