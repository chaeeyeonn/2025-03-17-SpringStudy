package com.sist.service;

import java.util.List;

import com.sist.vo.DeptVO;
import com.sist.vo.EmpVO;
// repository 가기 전 오류나면 중간에서 막기 위해 service 제작 => Controller는 오류가 나지 않은 다른 기능은 계속 작업 가능함 => 결합성 낮추기
// + 여러 DAO 한 번에 작업 가능
public interface EmpDeptService {
	public List<EmpVO> empListData();
	public EmpVO empDetailData(int empno);
	public List<EmpVO> empJoinData();
	public List<DeptVO> deptListData();
}
