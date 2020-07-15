package com.nwl.lanya.rest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nwl.lanya.common.MsgCode;
import com.nwl.lanya.common.PageModel;
import com.nwl.lanya.common.PropertiesUtil;
import com.nwl.lanya.dto.AddvertisementDto;
import com.nwl.lanya.dto.ResourcesDto;
import com.nwl.lanya.service.ResourcesService;

import sun.misc.BASE64Decoder;

@RestController
@RequestMapping("resourcesRest")
public class ResourcesRest extends AbstractBaseRest<ResourcesDto>{

	@Autowired
	private ResourcesService service;
	
	@Autowired
	private PropertiesUtil propertiesUtil;
	
	@RequestMapping("list")
	@Override
	public PageModel list(Integer page, Integer rows, ResourcesDto dto) {
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
	public ResourcesDto deleteByIds(ResourcesDto dto) {
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
	public ResourcesDto findById(ResourcesDto dto) {
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
	public ResourcesDto saveOrUpdate(ResourcesDto dto) {
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
	

	/**
	 * @throws IOException 
	 * 
	* @Title: uploadPicture 
	* @Description: 上传图片
	* @param    
	* @return void    
	* @throws
	 */
	@RequestMapping("uploadImg")
	public void upLoadImg(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String imgData = req.getParameter("imgData");
		String[] imgDatas = imgData.split("base64,");
		imgData = imgDatas[1];
		String type = imgDatas[0].split("/")[1];
		type = type.substring(0,type.length()-1);
		
		 String imgUrl = UUID.randomUUID()+"."+type;
		 if (imgData != null&&!imgData.equals("")){
			    BASE64Decoder decoder = new BASE64Decoder();
		        try {
		            //Base64解码
		        	 byte[] bytes = decoder.decodeBuffer(imgData);
		             for (int i = 0; i < bytes.length; ++i) {
		                 if (bytes[i] < 0) {// 调整异常数据
		                     bytes[i] += 256;
		                 }
		             }
		            //生成jpeg图片
		            String imgFilePath = propertiesUtil.getImgSoureUrl()+imgUrl;//新生成的图片
		            OutputStream out = new FileOutputStream(imgFilePath);
		            out.write(bytes);
		            out.flush();
		            out.close();
		        } catch (Exception e) {
		        	e.printStackTrace();
		        }
		 }
	    
	     resp.setContentType("text/html;charset=utf-8");
		 resp.getWriter().write(propertiesUtil.getImgHttpUrl()+imgUrl);
	}

	
	@RequestMapping("getAll")
	public ResourcesDto getAll(ResourcesDto dto) {
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
