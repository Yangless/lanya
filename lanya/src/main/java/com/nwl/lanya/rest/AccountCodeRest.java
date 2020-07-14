package com.nwl.lanya.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nwl.lanya.common.MsgCode;
import com.nwl.lanya.common.PageModel;
import com.nwl.lanya.dto.AccountCodeDto;
import com.nwl.lanya.service.AccountCodeService;


@RestController
@RequestMapping("accountcodeRest")
public class AccountCodeRest extends AbstractBaseRest<AccountCodeDto>{

	@Autowired
	private AccountCodeService service;
	
	@RequestMapping("list")
	@Override
	public PageModel list(Integer page, Integer rows, AccountCodeDto dto) {
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
	public AccountCodeDto deleteByIds(AccountCodeDto dto) {
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
	public AccountCodeDto findById(AccountCodeDto dto) {
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
	public AccountCodeDto saveOrUpdate(AccountCodeDto dto) {
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

}
