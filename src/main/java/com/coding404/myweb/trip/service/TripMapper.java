package com.coding404.myweb.trip.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.TripVO;

@Mapper
public interface TripMapper {
	
	public int noticeRegist(TripVO vo); 
	public ArrayList<TripVO> getList();
	public TripVO getContent(int tno);
	public int noticeModify(TripVO vo); //수정 
	public int noticeDelete(int tno); //삭제
	
	public void upHit(int tno); //조회수
	public ArrayList<TripVO> getPrevNext(int tno); //이전, 다음글
}
