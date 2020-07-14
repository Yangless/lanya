package com.nwl.lanya.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nwl.lanya.common.MsgCode;
import com.nwl.lanya.dto.AccountCodeDto;
import com.nwl.lanya.po.AccountCodeWithBLOBs;
import com.nwl.lanya.service.AccountCodeService;


@Controller
@RequestMapping("manage")
public class ManageController {
	
//	@Autowired
//	private AccountService accountService;
//	
//	/**
//	 * 
//	* @Title: register 
//	* @Description: 用户注册接口
//	* @param    
//	* @return String    
//	* @throws
//	 */
//	@RequestMapping("register")
//	public String register(AccountDto dto,Model model){
//		accountService.registerPhone(dto);
//		if(dto.getMsgCode()==MsgCode.REGISTER_SCCESS){
//			if(dto.getPwd().equals(dto.getConfirmPwd())){
//				accountService.register(dto);
//				model.addAttribute("message","注册成功");
//			}else{
//				model.addAttribute("message","两次密码输入不一致");
//			}
//		}else if(dto.getMsgCode()==MsgCode.REGISTER_ERROR){
//			model.addAttribute("message",dto.getMsg());
//		}
//		model.addAttribute("flag", true);
//		return "login";
//	}
//	@RequestMapping("login")
//	public String login(Model model){
//		model.addAttribute("flag", false);
//		return "login";
//	}
//	@RequestMapping("loginIndex")
//	public String loginError(Model model){
//		model.addAttribute("flag", true);
//		model.addAttribute("message", "账号或密码错误");
//		return "login";
//	}
//	@RequestMapping("loginOut")
//	public String loginOut(HttpSession session,Model model){
//		session.invalidate();
//		return "redirect:login";
//	}
//	@RequestMapping("index")
//	public String index(AccountDto dto,Model model){
//		accountService.login(dto);
//		Account account = dto.getAccount();
//		if(account!=null){
//			return "redirect:main";
//		}else{
//			return "redirect:loginIndex";
//		}
//	}
//	@RequestMapping("main")
//	public String main(){
//		return "main";
//	}
//	
//	@RequestMapping("noRight")
//	public String noRight(){
//		return "noRight";
//	}
//	
//	@RequestMapping("account")
//	public String account(){
//		return "account";
//	}
//	
//	@RequestMapping("role")
//	public String role(){
//		return "role";
//	}
//	
//	@RequestMapping("sysRight")
//	public String sysRight(){
//		return "sysRight";
//	}
//	
//	@RequestMapping("courseSystem")
//	public String courseSystem(){
//		return "courseSystem";
//	}
//	
//	@RequestMapping("student")
//	public String student(){
//		return "student";
//	}
//
//	@RequestMapping("statistics")
//	public String statistics(){
//		return "statistics";
//	}
//
//	@RequestMapping("courseFull")
//	public String courseFull(){
//		return "courseFull";
//	}
//
//	@RequestMapping("videoAudio")
//	public String videoAudio(){
//		return "videoAudio";
//	}
//	
//	@RequestMapping("teacher")
//	public String teacher(){
//		return "teacher";
//	}
//	
//	@RequestMapping("myTeacherTalk")
//	public String myTeacherTalk(){
//		return "myTeacherTalk";
//	}
//	
//	@RequestMapping("tribes")
//	public String tribes(){
//		return "tribes";
//	}
//	
//	@RequestMapping("myTribeTalk")
//	public String myTribeTalk(){
//		return "myTribeTalk";
//	}
//	
//	@RequestMapping("hr")
//	public String hr(){
//		return "hr";
//	}
//	
//	@RequestMapping("myWorkTalk")
//	public String myWorkTalk(){
//		return "myWorkTalk";
//	}
//	
//	@RequestMapping("company")
//	public String company(){
//		return "company";
//	}
//	
//	@RequestMapping("companyTeacher")
//	public String companyTeacher(){
//		return "companyTeacher";
//	}
//	
//	@RequestMapping("wallet")
//	public String wallet(){
//		return "wallet";
//	}
//	
//	@RequestMapping("comment")
//	public String comment(){
//		return "comment";
//	}
	@Autowired
	private AccountCodeService service;
	
	@RequestMapping("/index")
	public String index(Model model){
		
		return "manage/html/index";
	}
	@RequestMapping("/advertisment")
	public String advertisment(Model model){
		
		return "manage/html/addmanage";
	}
	@RequestMapping("/lable")
	public String lable(Model model){
		
		return "manage/html/lablemanage";
	}
	@RequestMapping("/account")
	public String account(Model model){
		
		return "manage/html/accountmanage";
	}
	@RequestMapping("/comment")
	public String comment(Model model){
		
		return "manage/html/commentmanage";
	}
	@RequestMapping("/resource")
	public String resource(Model model){
		
		return "manage/html/resourcemanage";
	}
	@RequestMapping("/login")
	public String login(HttpSession session,AccountCodeDto dto){
		System.out.println("进入login");
		AccountCodeWithBLOBs accountCodeWithBLOBs = service.login(dto);
		session.setAttribute("account",accountCodeWithBLOBs );
		if(accountCodeWithBLOBs==null){
			return "redirect:/login";
		}else{
			return "redirect:/manage/index";
		}
	}
	@RequestMapping("/updatePwd")
	public String updatePwd(Model model){
		model.addAttribute("flag", false);
		return "manage/html/updatePwd";
	}
}
