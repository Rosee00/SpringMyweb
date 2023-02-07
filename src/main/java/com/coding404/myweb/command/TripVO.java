package com.coding404.myweb.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성자
@AllArgsConstructor //생성자
public class TripVO {
	
	private int tno;
	private String tripdate;
	private String writer;
	private String title;
	private String content;
	private int hit;
	private Timestamp regdate;

}