package com.zby.server01.service.impl;

import com.zby.server01.dao.CommentMapper;
import com.zby.server01.pojo.Comment;
import com.zby.server01.pojo.CommentExample;
import com.zby.server01.pojo.Task;
import com.zby.server01.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public int createComment(Comment comment) {
        return commentMapper.insertSelective(comment);
    }

    @Override
    public int deleteComment(long uid, long commentId) {
        Comment comment = commentMapper.selectByPrimaryKey(commentId);
        if (comment.getUid()!=uid)
            return 0;
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public List<Comment> findCommentByTaskId(long taskId) {
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andTask_idEqualTo(taskId);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        if (comments.isEmpty())
            return null;
        return comments;
    }

    @Override
    public List<Comment> findCommentByUid(long uid) {
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        if (comments.isEmpty())
            return null;
        return comments;
    }
}
