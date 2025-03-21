package com.sist.dao;
// Anntation ±â¹Ý
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;
public class StudentDAO2 {
	private StudentMapper1 mapper;

	public void setMapper(StudentMapper1 mapper) {
		this.mapper = mapper;
	}
	public List<StudentVO> StudentListData()
	{
		return mapper.studentListData();
	}
	
	public StudentVO StudentDetailData(int hakbun)
	{
		return mapper.studentDetailData(hakbun);
	}
	public void studentInsert(StudentVO vo)
	{
		mapper.studentInsert(vo);
	}
	public void studentDelete(int hakbun)
	{
		mapper.studentDelete(hakbun);
	}
	public void studentUpdate(StudentVO vo)
	{
		mapper.studentUpdate(vo);
	}
}
