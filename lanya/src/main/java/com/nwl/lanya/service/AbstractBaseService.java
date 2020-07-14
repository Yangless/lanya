package com.nwl.lanya.service;

import com.nwl.lanya.dto.AbstractBaseDto;

public interface AbstractBaseService<T extends AbstractBaseDto>{
	
    void list(T dto);
	
	void deleteByIds(T dto);
	
	void findById(T dto);
	
	void saveOrUpdate(T dto);

}
