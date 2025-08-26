package com.jhjcompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index"; // 실제 서버에 있는 jsp 파일 이름(확장자(.jsp) 없음)
	}
	
	@RequestMapping(value = "/boardList")
	public String boardList() {
		
		return "boardList"; // 실제 서버에 있는 jsp 파일 이름(확장자(.jsp) 없음)
	}
	
	@RequestMapping(value = "/member/join")
	public String join() {
		
		return "member/joinMember"; 
		// 폴더이름/jsp파일이름
	}
}
