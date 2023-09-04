package org.zerock.domain;

import java.sql.Date;

import lombok.Data;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Data
public class BoardVO {
	
	private Long bno;
	private String content,writer,title;
	private Date regdate,updateDate;

}
