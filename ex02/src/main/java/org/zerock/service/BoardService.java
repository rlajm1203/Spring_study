package org.zerock.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	// 접근지정자를 default로 하는 이유는?
	// 
	
	void register(BoardVO board);
	
	Long registerGetKey(BoardVO board);
	
	BoardVO get(Long bno);
	
	int modify(BoardVO board);
	
	int remove(Long bno);
	
	List<BoardVO> getList();
	
	List<BoardVO> getList(Criteria cri);
}
