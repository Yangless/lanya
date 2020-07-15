package com.nwl.lanya.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwl.lanya.dao.ResourceCommentMapper;
import com.nwl.lanya.dto.ResourceCommentDto;
import com.nwl.lanya.po.AccountCodeWithBLOBs;
import com.nwl.lanya.po.Advertisment;
import com.nwl.lanya.po.ResourceComment;

@Service
public class ResourceCommentService implements AbstractBaseService<ResourceCommentDto>{

	@Autowired
	private ResourceCommentMapper mapper;
	
	@Override
	public void list(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		List<ResourceComment> resourcecomment = mapper.list(dto);
		Long total = mapper.countByList(dto);
		
		dto.getPageModel().setRows(resourcecomment);
		dto.getPageModel().setTotal(total);
	}

	@Override
	public void deleteByIds(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		String[] idStr = dto.getIds().split(",");
		for(int i=0;i<idStr.length;i++){
			String id = idStr[i];
			mapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public void findById(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		String id=dto.getPo().getId();
		ResourceComment resourcecomment=mapper.selectByPrimaryKey(id);
		dto.setPo(resourcecomment);
	}

	@Override
	public void saveOrUpdate(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		ResourceComment resourcecomment=dto.getPo();
		if(StringUtils.isEmpty(resourcecomment.getId())) {
			resourcecomment.setId(UUID.randomUUID().toString());
			resourcecomment.setCommentDate(new Date());
			mapper.insert(resourcecomment);
		}else{
			mapper.updateByPrimaryKeySelective(resourcecomment);
		}
	}

	public void getAll(ResourceCommentDto dto) {
		// TODO Auto-generated method stub
		List<ResourceComment> resourcecomment=mapper.selectByExample(null);
		dto.setPos(resourcecomment);
		
	}

}
