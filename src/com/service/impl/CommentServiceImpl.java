package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;  

import com.mapper.CommentMapper;
import com.pojo.Comment;
import com.pojo.User;
import com.pojo.combinePojo;
import com.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Resource
	private CommentMapper commentMapper;
	public List<Comment> getComment(){
		List<Comment> comment=commentMapper.showComment();
		return comment;
	}
	@Override
	public void insert(Comment comment) {
		// TODO Auto-generated method stub
		commentMapper.insert(comment);
	}
	@Override
	public List<combinePojo> selectComment(String useranme,String coursename) {
		List<combinePojo> combinePojo=commentMapper.selectComment(useranme,coursename);	
		if(combinePojo.size()==0){
			System.out.println("a error!");
		}
		return combinePojo;
	}
}
