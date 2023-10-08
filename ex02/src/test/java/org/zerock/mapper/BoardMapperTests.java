package org.zerock.mapper;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.pageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("----------------");
		boardMapper.getList();
	
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Test 테스트");
		vo.setContent("Content 테스트");
		vo.setWriter("tester");
		
		boardMapper.insert(vo);
		log.info("----------------------------");
		log.info("after insert " + vo.getBno());
	}
	
	@Test
	public void testInsertSelectkey() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setContent("임시 내용");
		vo.setWriter("임시 글쓴이");
		
		boardMapper.insertSelectKey(vo);
		log.info("after insert selectkey " + vo.getBno());
	}
	
	@Test
	public void testRead() {
		
		BoardVO vo = boardMapper.read(23L);
		log.info(vo);
		
	}
	
	@Test
	public void testDelete() {
		
		int count = boardMapper.delete(1L);
		log.info("count : " + count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(25L);
		vo.setTitle("Updated Title");
		vo.setContent("Updated content");
		vo.setWriter("user00");
		
		log.info("count : " + boardMapper.update(vo));
	}
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		
		cri.setPageNum(3);
		cri.setAmount(10);
		
		List<BoardVO> list = boardMapper.getListWithPaging(cri);
		
		list.forEach(b -> log.info(b.getBno()));
	}
	
	@Test
	public void testpageDTO() {
		
		Criteria cri = new Criteria();
		cri.setPageNum(21);
		
		pageDTO pageDTO = new pageDTO(cri, 251);
		
		log.info(pageDTO);
		
	}
}
