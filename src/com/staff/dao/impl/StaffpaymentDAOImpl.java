package com.staff.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.staff.dao.StaffpaymentDAO;
import com.staff.entity.Staffpayment;

@Repository("staffpaymentDAO")
public class StaffpaymentDAOImpl extends SqlSessionDaoSupport implements StaffpaymentDAO {

	@Override
	public List<Staffpayment> getStaffpaymentBySid(String sid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("com.staff.entity.StaffpaymentMapper", sid);
	}

}
