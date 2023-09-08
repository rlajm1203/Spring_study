package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {

	public void insert(BoardVO vo);
	
	public BoardVO select(Integer bno);
	
	public int update(BoardVO vo);
	
	@Delete("delete from tbl_board where bno = #{bno}")
	public int delete(Integer bno);
	
	@Select("select * from tbl_board where bno > 0 order by bno desc")
	public List<BoardVO> selectAll();
	
}
