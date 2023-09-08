package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private Integer bno;
	private String title, content, writer;
	private Date regdate;
}
