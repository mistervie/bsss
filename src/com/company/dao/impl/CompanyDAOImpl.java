package com.company.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.company.dao.CompanyDAO;
import com.company.entity.Company;

@Repository("companyDAO")
public class CompanyDAOImpl extends SqlSessionDaoSupport implements CompanyDAO{
	
	
	
	@Override
	public Company getCompanyCsnCname(String cid) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("com.company.entity.CompanyMapper.getCompanyCsnCname", cid);
	}

}
