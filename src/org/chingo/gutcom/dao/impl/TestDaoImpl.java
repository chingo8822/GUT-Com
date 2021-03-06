package org.chingo.gutcom.dao.impl;

import java.io.Serializable;

import org.chingo.gutcom.hibernate4.support.HDaoSupport;
import org.chingo.gutcom.dao.TestDao;

public class TestDaoImpl extends HDaoSupport implements TestDao
{

	@Override
	public void save(Object o)
	{
		// TODO Auto-generated method stub
		getSession().save(o);
	}

	@Override
	public Object get(Class c, Serializable id)
	{
		// TODO Auto-generated method stub
		return getSession().get(c, id);
	}

	@Override
	public void delete(Object o)
	{
		// TODO Auto-generated method stub
		getSession().delete(o);
	}

	@Override
	public Object getOne(Class c)
	{
		// TODO Auto-generated method stub
		return getSession().createQuery("from " + c.getSimpleName() + " c").setFetchSize(1).list().get(0);
	}
}
