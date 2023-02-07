package com.coding404.myweb.trip.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.TripVO;

@Service("tripService") //빈으로 생성
public class TripServiceImpl implements TripService {
	
	@Autowired
	private TripMapper tripMapper;
	
	@Override
	public int noticeRegist(TripVO vo) {
		return tripMapper.noticeRegist(vo); //별다른 작업이 없다면 바로 리턴에 작성: 컨트롤러 연결
	}
	
	//
	@Override
	public ArrayList<TripVO> getList() {
		return tripMapper.getList();
	}

}
