package com.mapper;

import com.pojo.WebsiteResources;
import com.pojo.WebsiteResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteResourcesMapper {
    long countByExample(WebsiteResourcesExample example);

    int deleteByExample(WebsiteResourcesExample example);

    int deleteByPrimaryKey(Integer webRcId);

    int insert(WebsiteResources record);

    int insertSelective(WebsiteResources record);

    List<WebsiteResources> selectByExample(WebsiteResourcesExample example);

    WebsiteResources selectByPrimaryKey(Integer webRcId);

    int updateByExampleSelective(@Param("record") WebsiteResources record, @Param("example") WebsiteResourcesExample example);

    int updateByExample(@Param("record") WebsiteResources record, @Param("example") WebsiteResourcesExample example);

    int updateByPrimaryKeySelective(WebsiteResources record);

    int updateByPrimaryKey(WebsiteResources record);
}