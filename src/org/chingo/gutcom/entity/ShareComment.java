package org.chingo.gutcom.entity;

// Generated Apr 14, 2013 10:15:06 PM by Hibernate Tools 4.0.0

/**
 * ShareComment generated by hbm2java
 */
public class ShareComment implements java.io.Serializable
{

	private Long cid;
	private ShareContent shareContent;
	private CommonUser commonUser;
	private String content;
	private byte status;
	private long dateline;

	public ShareComment()
	{
	}

	public ShareComment(ShareContent shareContent, CommonUser commonUser,
			String content, byte status, long dateline)
	{
		this.shareContent = shareContent;
		this.commonUser = commonUser;
		this.content = content;
		this.status = status;
		this.dateline = dateline;
	}

	public Long getCid()
	{
		return this.cid;
	}

	public void setCid(Long cid)
	{
		this.cid = cid;
	}

	public ShareContent getShareContent()
	{
		return this.shareContent;
	}

	public void setShareContent(ShareContent shareContent)
	{
		this.shareContent = shareContent;
	}

	public CommonUser getCommonUser()
	{
		return this.commonUser;
	}

	public void setCommonUser(CommonUser commonUser)
	{
		this.commonUser = commonUser;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public byte getStatus()
	{
		return this.status;
	}

	public void setStatus(byte status)
	{
		this.status = status;
	}

	public long getDateline()
	{
		return this.dateline;
	}

	public void setDateline(long dateline)
	{
		this.dateline = dateline;
	}

}
