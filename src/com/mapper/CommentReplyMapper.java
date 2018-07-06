package com.mapper;

import com.pojo.Comment;
import com.pojo.CommentReply;
import com.pojo.CommentReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentReplyMapper {
    long countByExample(CommentReplyExample example);

    int deleteByExample(CommentReplyExample example);

    int deleteByPrimaryKey(Integer commentReplyId);

    int insert(CommentReply record);

    int insertSelective(CommentReply record);

    List<CommentReply> selectByExampleWithBLOBs(CommentReplyExample example);

    List<CommentReply> selectByExample(CommentReplyExample example);
    
    CommentReply selectByPrimaryKey(Integer commentReplyId);
    
    List<CommentReply> showCommentReply(Integer commentId);
    
    int updateByExampleSelective(@Param("record") CommentReply record, @Param("example") CommentReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentReply record, @Param("example") CommentReplyExample example);

    int updateByExample(@Param("record") CommentReply record, @Param("example") CommentReplyExample example);

    int updateByPrimaryKeySelective(CommentReply record);

    int updateByPrimaryKeyWithBLOBs(CommentReply record);

    int updateByPrimaryKey(CommentReply record);
}