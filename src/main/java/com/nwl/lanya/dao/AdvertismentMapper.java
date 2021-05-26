package com.nwl.lanya.dao;

import com.nwl.lanya.dto.AccountCodeDto;
import com.nwl.lanya.dto.AddvertisementDto;
import com.nwl.lanya.po.AccountCode;
import com.nwl.lanya.po.Advertisment;
import com.nwl.lanya.po.AdvertismentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertismentMapper {
	
	List<Advertisment> list(AddvertisementDto dto);

	Long countByList(AddvertisementDto dto);
	
    long countByExample(AdvertismentExample example);

    int deleteByExample(AdvertismentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Advertisment record);

    int insertSelective(Advertisment record);

    List<Advertisment> selectByExample(AdvertismentExample example);

    Advertisment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Advertisment record, @Param("example") AdvertismentExample example);

    int updateByExample(@Param("record") Advertisment record, @Param("example") AdvertismentExample example);

    int updateByPrimaryKeySelective(Advertisment record);

    int updateByPrimaryKey(Advertisment record);

	
}