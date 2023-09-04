package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// Mapping 파일
	@Select("select sysdate from dual")
	String getTime();
	
}
