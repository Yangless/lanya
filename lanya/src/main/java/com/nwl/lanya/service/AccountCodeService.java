package com.nwl.lanya.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwl.lanya.common.PropertiesUtil;
import com.nwl.lanya.dao.AccountCodeMapper;
import com.nwl.lanya.dto.AccountCodeDto;
import com.nwl.lanya.po.AccountCodeWithBLOBs;

@Service
public class AccountCodeService implements AbstractBaseService<AccountCodeDto>{

	@Autowired
	private AccountCodeMapper mapper;
	
	@Autowired
	private PropertiesUtil propertiesUtil;
	
	public AccountCodeWithBLOBs login(AccountCodeDto dto){
		AccountCodeWithBLOBs accountCodeWithBLOBs = null;
		dto.getPo().setSalt(propertiesUtil.getSalt());
		System.out.println(dto.getPo().getAccountCode());
		System.out.println(dto.getPo().getPwd());
		accountCodeWithBLOBs = mapper.login(dto);
		//Session.setAttribute("account", "33");

		if(accountCodeWithBLOBs==null||StringUtils.isEmpty(accountCodeWithBLOBs.getId())){
			return null;
		}else{
			return accountCodeWithBLOBs;
		}
	}
	
	@Override
	public void list(AccountCodeDto dto) {
		// TODO 自动生成的方法存根
		List<AccountCodeWithBLOBs> accountcode = mapper.list(dto);
		Long total = mapper.countByList(dto);
		
		dto.getPageModel().setRows(accountcode);
		dto.getPageModel().setTotal(total);
	}

	@Override
	public void deleteByIds(AccountCodeDto dto) {
		// TODO 自动生成的方法存根
		String[] idStr = dto.getIds().split(",");
		for(int i=0;i<idStr.length;i++){
			String id = idStr[i];
			mapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public void findById(AccountCodeDto dto) {
		// TODO 自动生成的方法存根
		String id=dto.getPo().getId();
		System.out.println("accRest"+id);
		AccountCodeWithBLOBs accountcode=mapper.selectByPrimaryKey(id);
		dto.setPo(accountcode);
	}

	@Override
	public void saveOrUpdate(AccountCodeDto dto) {
		// TODO 自动生成的方法存根
		AccountCodeWithBLOBs accountcode=dto.getPo();
		if(StringUtils.isEmpty(accountcode.getId())) {
			accountcode.setId(UUID.randomUUID().toString());
			accountcode.setLoginTime(new Date());
			accountcode.setResourceTotal(0);
			accountcode.setDownloadTotal(0);
			accountcode.setFunsTotal(0);
			if(StringUtils.isEmpty(accountcode.getPwd())) {
				accountcode.setPwd(propertiesUtil.getInitPwd());
			}
			accountcode.setSalt(propertiesUtil.getSalt());
			mapper.insert(accountcode);
		}else{
			accountcode.setSalt(propertiesUtil.getSalt());
			mapper.updateByPrimaryKeySelective(accountcode);
		}
	}
	

}
