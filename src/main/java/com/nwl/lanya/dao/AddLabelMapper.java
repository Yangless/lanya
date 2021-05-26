package com.nwl.lanya.dao;

import com.nwl.lanya.po.AddLabel;
import com.nwl.lanya.po.AddLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddLabelMapper {
    long countByExample(AddLabelExample example);

    int deleteByExample(AddLabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(AddLabel record);

    int insertSelective(AddLabel record);

    List<AddLabel> selectByExample(AddLabelExample example);

    AddLabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AddLabel record, @Param("example") AddLabelExample example);

    int updateByExample(@Param("record") AddLabel record, @Param("example") AddLabelExample example);

    int updateByPrimaryKeySelective(AddLabel record);

    int updateByPrimaryKey(AddLabel record);
}