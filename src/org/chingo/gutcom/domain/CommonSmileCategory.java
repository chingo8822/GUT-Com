package org.chingo.gutcom.domain;

// Generated Apr 14, 2013 10:15:06 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * CommonSmileCategory generated by hbm2java
 */
public class CommonSmileCategory implements java.io.Serializable
{

	private Integer gid;
	private String groupName;
	private int order;
	private Set<CommonSmile> commonSmiles = new HashSet<CommonSmile>(0);

	public CommonSmileCategory()
	{
	}

	public CommonSmileCategory(String groupName, int order)
	{
		this.groupName = groupName;
		this.order = order;
	}

	public CommonSmileCategory(String groupName, int order,
			Set<CommonSmile> commonSmiles)
	{
		this.groupName = groupName;
		this.order = order;
		this.commonSmiles = commonSmiles;
	}

	public Integer getGid()
	{
		return this.gid;
	}

	public void setGid(Integer gid)
	{
		this.gid = gid;
	}

	public String getGroupName()
	{
		return this.groupName;
	}

	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}

	public int getOrder()
	{
		return this.order;
	}

	public void setOrder(int order)
	{
		this.order = order;
	}

	public Set<CommonSmile> getCommonSmiles()
	{
		return this.commonSmiles;
	}

	public void setCommonSmiles(Set<CommonSmile> commonSmiles)
	{
		this.commonSmiles = commonSmiles;
	}

}
