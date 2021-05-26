package com.nwl.lanya.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwl.lanya.dao.AdvertismentMapper;
import com.nwl.lanya.dao.LableInfoMapper;
import com.nwl.lanya.dto.AddvertisementDto;
import com.nwl.lanya.dto.LableInfoDto;
import com.nwl.lanya.po.Advertisment;
import com.nwl.lanya.po.LableInfo;

@Service
public class LableInfoService implements AbstractBaseService<LableInfoDto>{
	

	@Autowired
	private LableInfoMapper mapper;

	@Override
	public void list(LableInfoDto dto) {
		List<LableInfo> lableinfo = mapper.list(dto);
		Long total = mapper.countByList(dto);
		
		dto.getPageModel().setRows(lableinfo);
		dto.getPageModel().setTotal(total);
	} 

	@Override
	public void deleteByIds(LableInfoDto dto) {
		String[] idStr = dto.getIds().split(",");
		for(int i=0;i<idStr.length;i++){
			String id = idStr[i];
			mapper.deleteByPrimaryKey(id);
		}
		
	}

	@Override
	public void findById(LableInfoDto dto) {
		// TODO 自动生成的方法存根
		String id=dto.getPo().getId();
		LableInfo lableinfo=mapper.selectByPrimaryKey(id);
		dto.setPo(lableinfo);
	}

	
	@Override
	public void saveOrUpdate(LableInfoDto dto) {
		LableInfo lable=dto.getPo();
		if(StringUtils.isEmpty(lable.getId())) {
			lable.setId(UUID.randomUUID().toString());
			mapper.insert(lable);
		}else{
			mapper.updateByPrimaryKeySelective(lable);
		}
	}

	public void getAll(LableInfoDto dto) {
		// TODO 自动生成的方法存根
		List<LableInfo> lableInfos=mapper.selectByExample(null);
		dto.setPos(lableInfos);
	}
	
}
