package com.example.demo.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
	List<Schedule> findByMidOrderBySname(Integer mid);
	// 使用findBy自動化命名規則進行條件搜尋 //條件::member_id=? AND schedule_name=? ORDER BY sort ASC
	List<Schedule> findByMidAndSnameOrderBySort(Integer mid, String sname);
	// 使用findBy自動化命名規則進行條件搜尋 //條件:member_id=? ORDER BY schedule_name
	List<Schedule> findByRedate(Date redate);
	List<Schedule> findByRedateOrderBySname(Date redate);
	List<Schedule> findByRedateOrderBySnameAscSortAsc(Date redate);
	List<Schedule> findBySid(Integer sid);
}
