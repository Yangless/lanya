package com.nwl.lanya.dao;

import com.nwl.lanya.dto.ResourceCommentDto;
import com.nwl.lanya.po.ResourceComment;
import com.nwl.lanya.po.ResourceCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceCommentMapper {
    long countByExample(ResourceCommentExample example);

    int deleteByExample(ResourceCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResourceComment record);

    int insertSelective(ResourceComment record);

    List<ResourceComment> selectByExample(ResourceCommentExample example);

    ResourceComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResourceComment record, @Param("example") ResourceCommentExample example);

    int updateByExample(@Param("record") ResourceComment record, @Param("example") ResourceCommentExample example);

    int updateByPrimaryKeySelective(ResourceComment record);

    int updateByPrimaryKey(ResourceComment record);

	List<ResourceComment> list(ResourceCommentDto dto);

	Long countByList(ResourceCommentDto dto);
}