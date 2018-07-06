package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CommentReplyMapper;
import com.pojo.Comment;
import com.pojo.CommentReply;
import com.service.CommentReplyService;
@Service
public class CommentReplyServiceImpl implements CommentReplyService {
	@Resource
	public CommentReplyMapper commentReplyMapper;

	@Override
	public List<CommentReply> getCommentReply(int commentId) {
		// TODO Auto-generated method stub
		List<CommentReply> comment=commentReplyMapper.showCommentReply(commentId);
/*		 if(comment.size()==0){
			 System.out.println("error!");
		 } */
		return comment;
	}

	@Override
	public void insert(CommentReply commentReply) {
		// TODO Auto-generated method stub
		commentReplyMapper.insert(commentReply);
	}

	

}
