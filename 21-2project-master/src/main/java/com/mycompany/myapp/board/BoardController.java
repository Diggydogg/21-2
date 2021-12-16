package com.mycompany.myapp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@Autowired
	BoardDAO boardDAO;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", boardDAO.getBoardList());
		float ave = 0;
		List<BoardVO> t = boardDAO.getWeekAve();
		if (t.size() >= 7) {
			for (int i = 0; i < 7; i ++) {
				ave += t.get(i).getTemp();
			}
			ave = ave / 7;
		}
		else {
			ave = 0;
		}
		model.addAttribute("ave", ave);
		return "list";
	}
	
	@RequestMapping(value = "/board/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	@RequestMapping(value = "board/addok", method = RequestMethod.GET)
	public String addPostOK(BoardVO vo) {
		int i = boardDAO.insertBoard(vo);
		if (i == 0) {
			System.out.println("데이터 추가 실패 ");
		}
		else {
			System.out.println("데이터 추가 성공!!!");
		}
		return "redirect:list";
	}
	
	@RequestMapping(value = "board/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		BoardVO boardVO = boardDAO.getBoard(id);
		model.addAttribute("boardVO", boardVO);
		return "editform";
	}
	
	@RequestMapping(value = "board/editok", method = RequestMethod.GET)
	public String editPostOK(BoardVO vo) {
		int i = boardDAO.updateBoard(vo);
		if (i == 0) {
			System.out.println("데이터 수정 실패 ");
		}
		else {
			System.out.println("데이터 수정 성공!!!");
		}
		return "redirect:list";
	}
	
	@RequestMapping(value = "board/deleteok/{id}", method = RequestMethod.GET)
	public String deleteOK(@PathVariable("id") int id) {
		int i = boardDAO.deleteBoard(id);
		if (i == 0) {
			System.out.println("데이터 삭제 실패 ");
		}
		else {
			System.out.println("데이터 삭제 성공!!!");
		}
		return "redirect:../list";
	}
}
