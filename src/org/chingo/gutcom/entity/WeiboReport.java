package org.chingo.gutcom.entity;

// Generated Apr 11, 2013 4:11:18 PM by Hibernate Tools 4.0.0

/**
 * WeiboReport generated by hbm2java
 */
public class WeiboReport implements java.io.Serializable
{

	private Long rid;
	private CommonUser commonUser;
	private WeiboContent weiboContent;
	private int dateline;
	private String reason;
	private byte status;

	public WeiboReport()
	{
	}

	public WeiboReport(CommonUser commonUser, WeiboContent weiboContent,
			int dateline, String reason, byte status)
	{
		this.commonUser = commonUser;
		this.weiboContent = weiboContent;
		this.dateline = dateline;
		this.reason = reason;
		this.status = status;
	}

	public Long getRid()
	{
		return this.rid;
	}

	public void setRid(Long rid)
	{
		this.rid = rid;
	}

	public CommonUser getCommonUser()
	{
		return this.commonUser;
	}

	public void setCommonUser(CommonUser commonUser)
	{
		this.commonUser = commonUser;
	}

	public WeiboContent getWeiboContent()
	{
		return this.weiboContent;
	}

	public void setWeiboContent(WeiboContent weiboContent)
	{
		this.weiboContent = weiboContent;
	}

	public int getDateline()
	{
		return this.dateline;
	}

	public void setDateline(int dateline)
	{
		this.dateline = dateline;
	}

	public String getReason()
	{
		return this.reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public byte getStatus()
	{
		return this.status;
	}

	public void setStatus(byte status)
	{
		this.status = status;
	}

}