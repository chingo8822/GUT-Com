package org.chingo.gutcom.domain;

// Generated Apr 14, 2013 10:15:06 PM by Hibernate Tools 4.0.0

/**
 * CommonMsgSend generated by hbm2java
 */
public class CommonMsgSend implements java.io.Serializable
{

	private String mid; // rowKey，消息ID
	private String recvuserId; // 接收用户ID
	private String senduserId; // 发送用户ID
	private CommonUser recvuser; // 接收用户对象
	private CommonUser senduser; // 发送用户对象
	private String content; // 消息内容
	private long dateline; // 发送时间戳

	public CommonMsgSend()
	{
	}

	public CommonMsgSend(String mid, String recvuserId,
			String senduserId, String content, long dateline)
	{
		this.mid = mid;
		this.recvuserId = recvuserId;
		this.senduserId = senduserId;
		this.content = content;
		this.dateline = dateline;
	}
	
	public String getMid()
	{
		return this.mid;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public long getDateline()
	{
		return this.dateline;
	}

	public void setDateline(long dateline)
	{
		this.dateline = dateline;
	}

	public String getRecvuserId()
	{
		return recvuserId;
	}

	public void setRecvuserId(String recvuserId)
	{
		this.recvuserId = recvuserId;
	}

	public String getSenduserId()
	{
		return senduserId;
	}

	public void setSenduserId(String senduserId)
	{
		this.senduserId = senduserId;
	}

	public CommonUser getRecvuser()
	{
		return recvuser;
	}

	public void setRecvuser(CommonUser recvuser)
	{
		this.recvuser = recvuser;
	}

	public CommonUser getSenduser()
	{
		return senduser;
	}

	public void setSenduser(CommonUser senduser)
	{
		this.senduser = senduser;
	}

	public void setMid(String mid)
	{
		this.mid = mid;
	}

}
