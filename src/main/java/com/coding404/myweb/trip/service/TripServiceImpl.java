package com.coding404.myweb.trip.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.TripVO;
import com.coding404.myweb.util.Criteria;

@Service("tripService") //빈으로 생성
public class TripServiceImpl implements TripService {
	
	@Autowired
	private TripMapper tripMapper;
	
	@Override //등록
	public int noticeRegist(TripVO vo) {
		return tripMapper.noticeRegist(vo); //별다른 작업이 없다면 바로 리턴에 작성: 컨트롤러 연결
	}
	
	//
	@Override //조회
	public ArrayList<TripVO> getList(Criteria cri) {
		return tripMapper.getList(cri);
	}
	
	@Override //전체게시글 수 
	public int getTotal(Criteria cri) {
		return tripMapper.getTotal(cri);
	}

	
	
	@Override //상세조회
	public TripVO getContent(int tno) {	
		return tripMapper.getContent(tno);
	}
	
	@Override //수정
	public int noticeModify(TripVO vo) {
		return tripMapper.noticeModify(vo);
	}
	
	@Override //삭제
	public int noticeDelete(int tno) {
		return tripMapper.noticeDelete(tno);
	}
	
	@Override //조회수
	public void upHit(int tno) {
		tripMapper.upHit(tno);
	}
	
	@Override //이전,다음글
	public ArrayList<TripVO> getPrevNext(int tno) {
		return tripMapper.getPrevNext(tno);
	}
	
	
}
