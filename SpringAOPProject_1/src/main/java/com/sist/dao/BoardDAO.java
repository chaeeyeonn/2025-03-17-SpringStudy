package com.sist.dao;
/*
 *  결합성이 낮은 프로그램 => 여러 명의 개발자가 동시 개발
 *  => Container / POJO / DI
 *  
 *  공통모듈 => AOP(횡단지향 프로그램): 반복 코딩을 하지 않는다
 *  
 *  ** OOP VS AOP
 *  AOP: OOP의 단점을 보완
 *  	=> 자동 호출 가능
 *  	=> CallBack
 *  	=> 어떤 메소드인지
 *   	=> 어느 시점인지
 */
public class BoardDAO {
//	public void getConnection()
//	{
//		System.out.println("오라클 연결");
//	}
//	public void disConnection()
//	{
//		System.out.println("오라클 닫기");
//	}
//	
	public void boardListData(int page)
	{
		//getConnection();
		System.out.println(page+"페이지 목록 출력");
		//disConnection();
	}
	public String boardDetailData(String name)
	{
		//getConnection();
		System.out.println(name+"에 대한 상세보기");
		//disConnection();
		return name;
	}
	public void boardInsert()
	{
		//getConnection();
		System.out.println("게시물 추가 완료");
		//disConnection();
	}
	public void boardUpdate()
	{
		//getConnection();
		System.out.println("게시물 수정 완료");
		//disConnection();
	}
	public void boardDelete()
	{
		//getConnection();
		System.out.println("게시물 삭제 완료");
		//disConnection();
	}
	public void print()
	{
		System.out.println("프로그램 종료");
	}
}
