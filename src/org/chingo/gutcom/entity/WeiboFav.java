package org.chingo.gutcom.entity;

// Generated Apr 11, 2013 4:11:18 PM by Hibernate Tools 4.0.0

/**
 * WeiboFav generated by hbm2java
 */
public class WeiboFav implements java.io.Serializable
{

	private Long fid;
	private WeiboContent weiboContent;
	private CommonUser commonUser;

	public WeiboFav()
	{
	}

	public WeiboFav(WeiboContent weiboContent, CommonUser commonUser)
	{
		this.weiboContent = weiboContent;
		this.commonUser = commonUser;
	}

	public Long getFid()
	{
		return this.fid;
	}

	public void setFid(Long fid)
	{
		this.fid = fid;
	}

	public WeiboContent getWeiboContent()
	{
		return this.weiboContent;
	}

	public void setWeiboContent(WeiboContent weiboContent)
	{
		this.weiboContent = weiboContent;
	}

	public CommonUser getCommonUser()
	{
		return this.commonUser;
	}

	public void setCommonUser(CommonUser commonUser)
	{
		this.commonUser = commonUser;
	}

}