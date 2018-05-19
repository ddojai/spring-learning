package com.springbook.view.board;

import org.springframework.stereotype.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertBoardController {

    @RequestMapping(value = "/insertBoard.do")
    public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
        boardDAO.insertBoard(vo);
        return "redirect:getBoardList.do";
    }
}
