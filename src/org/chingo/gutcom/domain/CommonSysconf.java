package org.chingo.gutcom.domain;

// Generated Apr 14, 2013 10:15:06 PM by Hibernate Tools 4.0.0

/**
 * CommonSysconf generated by hbm2java
 */
public class CommonSysconf implements java.io.Serializable
{

	private String confname; // rowKey，设置字段名
	private String confvalue; // 设置值

	public CommonSysconf()
	{
	}

	public CommonSysconf(String confname, String confvalue)
	{
		this.confname = confname;
		this.confvalue = confvalue;
	}

	public String getConfname()
	{
		return this.confname;
	}

	public void setConfname(String confname)
	{
		this.confname = confname;
	}

	public String getConfvalue()
	{
		return this.confvalue;
	}

	public void setConfvalue(String confvalue)
	{
		this.confvalue = confvalue;
	}

}
