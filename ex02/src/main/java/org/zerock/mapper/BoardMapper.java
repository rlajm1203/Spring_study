package org.zerock.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	// 1순위 : 메소드 이름
	// 2순위 : 메소드 파라미터 (이름 , 타입)
	// 3순위 : 메소드 리턴타입
	public void insert(BoardVO boardVO);
	
	void insertSelectKey(BoardVO board);

}
