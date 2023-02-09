package com.coding404.myweb.trip.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.TripVO;
import com.coding404.myweb.util.Criteria;

@Mapper
public interface TripMapper {
	
	public int noticeRegist(TripVO vo); 
	//public ArrayList<TripVO> getList(); //조회
	public ArrayList<TripVO> getList(Criteria cri); //조회(페이지네이션)
	public int getTotal(Criteria cri); //전체게시글수
	public TripVO getContent(int tno);
	public int noticeModify(TripVO vo); //수정 
	public int noticeDelete(int tno); //삭제
	
	public void upHit(int tno); //조회수
	public ArrayList<TripVO> getPrevNext(int tno); //이전, 다음글
}
