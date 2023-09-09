package org.zerock.controller;

import java.sql.SQLException;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	private final BoardService service;
	
	// Model객체는 주로 웹 브라우저로부터 데이터를 가져오려고 사용하는 것이 아니라
	// 브라우저 이외에 곳에서(주로 데이터베이스) 데이터를 가져오려고 사용한다.
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list..........");
		
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}
	
	@GetMapping("/register")
	public void registerGET() {
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		log.info("register : " + board);
		Long bno = service.registerGetKey(board);
		log.info("BNO : " + bno);
		
		// FlashAttribute - 파라미터가 한번만 전송이되고 URL에는 포함되지 않는다.
		// http session에 데이터를 담아서 보낸다.
		rttr.addFlashAttribute("result", bno);
		
		
		// Attribute - 파라미터가 URL에 포함된다.
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		
		int count = service.modify(board);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
		
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		
		int count = service.remove(bno);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
}