package com.service;

import java.util.List;

import com.pojo.Comment;
import com.pojo.combinePojo;

public interface CommentService {
	public List<Comment> getComment();
	public void insert(Comment comment);
	public List<combinePojo> selectComment(String useranme,String coursename);
}
