package com.zby.server01.service;

import com.zby.server01.pojo.Comment;
import com.zby.server01.pojo.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    int createComment(Comment comment);
    int deleteComment(long uid,long commentId);
    List<Comment> findCommentByTaskId(long taskId);
    List<Comment> findCommentByUid(long uid);
}
