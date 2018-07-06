package com.service;

import java.util.List;

import com.pojo.Comment;
import com.pojo.CommentReply;

public interface CommentReplyService {
	public List<CommentReply> getCommentReply(int commentId);
	public void insert(CommentReply commentReply);
}
