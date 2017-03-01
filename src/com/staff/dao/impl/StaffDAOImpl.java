package com.staff.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.staff.dao.StaffDAO;
import com.staff.entity.Staff;
import com.staff.entity.Staffpayment;

@Repository("staffDAO")
public class StaffDAOImpl extends SqlSessionDaoSupport implements StaffDAO{

	@Override
	public Staff getStaffBasicInfo(String sid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("com.staff.entity.StaffMapper.getStaffBasicInfo", sid);
	}

	@Override
	public int updateStaffBasicInfo(Staff staff) {
		// TODO Auto-generated method stub
		return getSqlSession().update("com.staff.entity.StaffMapper.updateStaffBasicInfo", staff);
	}

	@Override
	public List<Staff> getStaffsByName(String sname, int start, int limit) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sname", sname);
		map.put("start", start);
		map.put("limit", limit);
		return getSqlSession().selectList("com.staff.entity.StaffMapper.getStaffsByName", map);
	}

	@Override
	public int getStaffsCountByName(String sname) {
		// TODO Auto-generated method stub
		int x = (Integer)getSqlSession().selectOne("com.staff.entity.StaffMapper.getStaffsCountByName", sname);
		System.out.println("-----------------"+x);
		return getSqlSession().selectOne("com.staff.entity.StaffMapper.getStaffsCountByName", sname);
	}


}
