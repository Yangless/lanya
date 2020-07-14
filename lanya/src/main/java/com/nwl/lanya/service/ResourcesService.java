package com.nwl.lanya.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwl.lanya.dao.ResoucesMapper;

import com.nwl.lanya.dto.ResourcesDto;
import com.nwl.lanya.po.Resouces;
import com.nwl.lanya.po.ResourceComment;

@Service
public class ResourcesService implements AbstractBaseService<ResourcesDto>{

	@Autowired
	private ResoucesMapper mapper;
	
	@Override
	public void list(ResourcesDto dto) {
		// TODO 自动生成的方法存根
		List<Resouces> resouces = mapper.list(dto);
		Long total = mapper.countByList(dto);
		
		dto.getPageModel().setRows(resouces);
		dto.getPageModel().setTotal(total);
	}

	@Override
	public void deleteByIds(ResourcesDto dto) {
		// TODO 自动生成的方法存根
		String[] idStr = dto.getIds().split(",");
		for(int i=0;i<idStr.length;i++){
			String id = idStr[i];
			mapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public void findById(ResourcesDto dto) {
		// TODO 自动生成的方法存根
		String id=dto.getPo().getId();
		Resouces resouces=mapper.selectByPrimaryKey(id);
		dto.setPo(resouces);
	}

	@Override
	public void saveOrUpdate(ResourcesDto dto) {
		// TODO 自动生成的方法存根
		Resouces resouces=dto.getPo();
		if(StringUtils.isEmpty(resouces.getId())) {
			resouces.setId(UUID.randomUUID().toString());
			resouces.setResourceDate(new Date());
			resouces.setScore(0.0);
			resouces.setDownloadCount(0);
			resouces.setViewCount(0);
			mapper.insert(resouces);
		}else{
			mapper.updateByPrimaryKeySelective(resouces);
		}
	}

}
