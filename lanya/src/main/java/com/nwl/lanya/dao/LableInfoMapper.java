package com.nwl.lanya.dao;

import com.nwl.lanya.dto.LableInfoDto;
import com.nwl.lanya.po.LableInfo;
import com.nwl.lanya.po.LableInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LableInfoMapper {
	

	Long countByList(LableInfoDto dto);
	
    long countByExample(LableInfoExample example);

    int deleteByExample(LableInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(LableInfo record);

    int insertSelective(LableInfo record);

    List<LableInfo> selectByExample(LableInfoExample example);

    LableInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LableInfo record, @Param("example") LableInfoExample example);

    int updateByExample(@Param("record") LableInfo record, @Param("example") LableInfoExample example);

    int updateByPrimaryKeySelective(LableInfo record);

    int updateByPrimaryKey(LableInfo record);

	List<LableInfo> list(LableInfoDto dto);

	
}