package com.nwl.lanya.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nwl.lanya.common.MsgCode;
import com.nwl.lanya.common.PageModel;
import com.nwl.lanya.dto.AddvertisementDto;
import com.nwl.lanya.dto.LableInfoDto;
import com.nwl.lanya.service.LableInfoService;

@RestController
@RequestMapping("lableinfoRest")
public class LableInfoRest extends AbstractBaseRest<LableInfoDto>{

	@Autowired
	private LableInfoService service;
	
	@RequestMapping("list")
	@Override
	public PageModel list(Integer page, Integer rows, LableInfoDto dto) {
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
	public LableInfoDto deleteByIds(LableInfoDto dto) {
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
	public LableInfoDto findById(LableInfoDto dto) {
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
	public LableInfoDto saveOrUpdate(LableInfoDto dto) {
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
	public LableInfoDto getAll(LableInfoDto dto) {
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
