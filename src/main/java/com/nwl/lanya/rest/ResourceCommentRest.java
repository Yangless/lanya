package com.nwl.lanya.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nwl.lanya.common.MsgCode;
import com.nwl.lanya.common.PageModel;
import com.nwl.lanya.dto.AddvertisementDto;
import com.nwl.lanya.dto.ResourceCommentDto;
import com.nwl.lanya.service.ResourceCommentService;

@RestController
@RequestMapping("resourcecommentRest")
public class ResourceCommentRest extends AbstractBaseRest<ResourceCommentDto>{

	@Autowired
	private ResourceCommentService service;
	
	@RequestMapping("list")
	@Override
	public PageModel list(Integer page, Integer rows, ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		try {
			PageModel pageModel = new PageModel();
			pageModel.setPageNo(page);
			pageModel.setPageSize(rows);
			pageModel.setStartIndex((page-1)*rows);
			dto.setPageModel(pageModel);
			
			service.list(dto);
			dto.setMsgCode(MsgCode.REQUEST_SCCESS);
			dto.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMsgCode(MsgCode.REQUEST_FALSE);
			dto.setMsg("系统异常,请联系维护人员");
		}
		return dto.getPageModel();
	}

	@RequestMapping("deleteByIds")
	@Override
	public ResourceCommentDto deleteByIds(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		try {
			service.deleteByIds(dto);
			
			dto.setMsgCode(MsgCode.REQUEST_SCCESS);
			dto.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMsgCode(MsgCode.REQUEST_FALSE);
			dto.setMsg("系统异常,请联系维护人员");
		}
		return dto;
	}

	@RequestMapping("findById")
	@Override
	public ResourceCommentDto findById(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		try {
			service.findById(dto);
			
			dto.setMsgCode(MsgCode.REQUEST_SCCESS);
			dto.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMsgCode(MsgCode.REQUEST_FALSE);
			dto.setMsg("系统异常,请联系维护人员");
		}
		return dto;
	}

	@RequestMapping("saveOrUpdate")
	@Override
	public ResourceCommentDto saveOrUpdate(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		try {
			service.saveOrUpdate(dto);
			
			dto.setMsgCode(MsgCode.REQUEST_SCCESS);
			dto.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMsgCode(MsgCode.REQUEST_FALSE);
			dto.setMsg("系统异常,请联系维护人员");
		}
		return dto;
	}
	

	
	
	
	@RequestMapping("getAll")
	public ResourceCommentDto getAll(ResourceCommentDto dto) {
		// TODO 自动生成的方法存根
		try {
			service.getAll(dto);
			
			dto.setMsgCode(MsgCode.REQUEST_SCCESS);
			dto.setMsg("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMsgCode(MsgCode.REQUEST_FALSE);
			dto.setMsg("系统异常,请联系维护人员");
		}
		return dto;

	}

}
