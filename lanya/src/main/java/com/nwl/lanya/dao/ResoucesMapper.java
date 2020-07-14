package com.nwl.lanya.dao;

import com.nwl.lanya.dto.ResourcesDto;
import com.nwl.lanya.po.Resouces;
import com.nwl.lanya.po.ResoucesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResoucesMapper {
    long countByExample(ResoucesExample example);

    int deleteByExample(ResoucesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Resouces record);

    int insertSelective(Resouces record);

    List<Resouces> selectByExampleWithBLOBs(ResoucesExample example);

    List<Resouces> selectByExample(ResoucesExample example);

    Resouces selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Resouces record, @Param("example") ResoucesExample example);

    int updateByExampleWithBLOBs(@Param("record") Resouces record, @Param("example") ResoucesExample example);

    int updateByExample(@Param("record") Resouces record, @Param("example") ResoucesExample example);

    int updateByPrimaryKeySelective(Resouces record);

    int updateByPrimaryKeyWithBLOBs(Resouces record);

    int updateByPrimaryKey(Resouces record);

	List<Resouces> list(ResourcesDto dto);

	Long countByList(ResourcesDto dto);
}