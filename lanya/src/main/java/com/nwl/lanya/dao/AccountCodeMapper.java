package com.nwl.lanya.dao;

import com.nwl.lanya.dto.AccountCodeDto;
import com.nwl.lanya.po.AccountCode;
import com.nwl.lanya.po.AccountCodeExample;
import com.nwl.lanya.po.AccountCodeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCodeMapper {
	
	List<AccountCodeWithBLOBs> list(AccountCodeDto dto);
	
	Long countByList(AccountCodeDto dto);
	
    long countByExample(AccountCodeExample example);

    int deleteByExample(AccountCodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccountCodeWithBLOBs record);

    int insertSelective(AccountCodeWithBLOBs record);

    List<AccountCodeWithBLOBs> selectByExampleWithBLOBs(AccountCodeExample example);

    List<AccountCode> selectByExample(AccountCodeExample example);

    AccountCodeWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountCodeWithBLOBs record, @Param("example") AccountCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") AccountCodeWithBLOBs record, @Param("example") AccountCodeExample example);

    int updateByExample(@Param("record") AccountCode record, @Param("example") AccountCodeExample example);

    int updateByPrimaryKeySelective(AccountCodeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AccountCodeWithBLOBs record);

    int updateByPrimaryKey(AccountCode record);

	AccountCodeWithBLOBs login(AccountCodeDto dto);

}