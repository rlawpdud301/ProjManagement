package com.yi.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yi.domain.ProjManagementVO;
import com.yi.service.ManagementService;


@Controller
@RequestMapping("/proj/*") /*boardcontorller 안의 모든 url command 앞에 /board/ 가붙음*/
public class ProjController {

	@Autowired
	private ManagementService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ProjController.class);
	
	@RequestMapping(value ="list", method = RequestMethod.GET)
	public void list(Model model) throws SQLException {
		model.addAttribute("list",service.select());	 
	}

	
	@RequestMapping(value ="register", method = RequestMethod.GET)
	public void registerGet() {
		logger.info("register-Get");
	}
	
	@RequestMapping(value ="register", method = RequestMethod.POST)
	public String registerPost(ProjManagementVO vo, Model model) throws SQLException {
		logger.info("register-Post");		
		service.insert(vo);
		model.addAttribute("result","success");				
		return "redirect:/proj/list";
	}
	
	@RequestMapping(value ="read", method = RequestMethod.GET)
	public void read(@RequestParam("proj_no") String proj_no, Model model) throws SQLException {
		logger.info("read-Get");
		ProjManagementVO vo = service.selectByNo(proj_no);
		model.addAttribute("vo",vo);
	}

	
	@RequestMapping(value ="remove", method = RequestMethod.GET)
	public String remove(String proj_no, Model model) throws SQLException {
		logger.info("remove-get");
		service.delet(proj_no); 
		return "redirect:/proj/list";
	}

	@RequestMapping(value ="modify", method = RequestMethod.GET)
	public void modifyGet(@RequestParam("proj_no") String proj_no, Model model) throws SQLException {
		logger.info("modify-Get");
		
		ProjManagementVO vo = service.selectByNo(proj_no);
		model.addAttribute("start_date",vo.getStart_dateDate());
		model.addAttribute("end_date",vo.getEnd_dateDate());
		model.addAttribute("vo",vo);
	}
	
	
	@RequestMapping(value ="modify", method = RequestMethod.POST)
	public String modifyPost(ProjManagementVO vo ,Model model) throws SQLException {
		
		logger.info("modify-Post"); 		
		service.update(vo);
		return "redirect:/proj/read?proj_no="+vo.getProj_no();
	}
}
