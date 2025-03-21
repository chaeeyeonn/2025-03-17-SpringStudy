package com.sist.mapper;
import com.sist.vo.*;
import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
public interface FoodMapper {
	//목록 출력
	@Select("SELECT fno,name,type,num "
			+"FROM (SELECT fno,name,type,rownum as num "
			+"FROM (SELECT fno,name,type "
			+"FROM project_food ORDER BY fno ASC)) "
			+"WHERE num BETWEEN #{start} AND #{end}")
	//public List<FoodVO> foodListData(Map map);
	public List<FoodVO> foodListData(@Param("start") int start,@Param("end") int end);
	//parameter를 여러 개 넣을 수 있음 @param => Mybatis에서만 사용
	//메모리는 순서 상관없이 빈 공간에 parameter를 넣기 때문에 위치 설정을 해 주어야 함
	@Select("SELECT CEIL(COUNT(*)/10.0) FROM project_food")
	public int foodTotalPage();
}
