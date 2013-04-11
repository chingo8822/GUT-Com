package org.chingo.gutcom.entity;

// Generated Apr 11, 2013 4:11:18 PM by Hibernate Tools 4.0.0

/**
 * CommonUserStatus generated by hbm2java
 */
public class CommonUserStatus implements java.io.Serializable
{

	private Integer uid;
	private CommonUser commonUser;
	private String regip;
	private int lastlogin;
	private String lastip;
	private int weibocnt;
	private int sharecnt;
	private int follower;
	private int following;
	private int newfollower;
	private int newmsg;
	private int newat;
	private int newcomment;

	public CommonUserStatus()
	{
	}

	public CommonUserStatus(CommonUser commonUser, String regip, int lastlogin,
			String lastip, int weibocnt, int sharecnt, int follower,
			int following, int newfollower, int newmsg, int newat,
			int newcomment)
	{
		this.commonUser = commonUser;
		this.regip = regip;
		this.lastlogin = lastlogin;
		this.lastip = lastip;
		this.weibocnt = weibocnt;
		this.sharecnt = sharecnt;
		this.follower = follower;
		this.following = following;
		this.newfollower = newfollower;
		this.newmsg = newmsg;
		this.newat = newat;
		this.newcomment = newcomment;
	}

	public Integer getUid()
	{
		return this.uid;
	}

	public void setUid(Integer uid)
	{
		this.uid = uid;
	}

	public CommonUser getCommonUser()
	{
		return this.commonUser;
	}

	public void setCommonUser(CommonUser commonUser)
	{
		this.commonUser = commonUser;
	}

	public String getRegip()
	{
		return this.regip;
	}

	public void setRegip(String regip)
	{
		this.regip = regip;
	}

	public int getLastlogin()
	{
		return this.lastlogin;
	}

	public void setLastlogin(int lastlogin)
	{
		this.lastlogin = lastlogin;
	}

	public String getLastip()
	{
		return this.lastip;
	}

	public void setLastip(String lastip)
	{
		this.lastip = lastip;
	}

	public int getWeibocnt()
	{
		return this.weibocnt;
	}

	public void setWeibocnt(int weibocnt)
	{
		this.weibocnt = weibocnt;
	}

	public int getSharecnt()
	{
		return this.sharecnt;
	}

	public void setSharecnt(int sharecnt)
	{
		this.sharecnt = sharecnt;
	}

	public int getFollower()
	{
		return this.follower;
	}

	public void setFollower(int follower)
	{
		this.follower = follower;
	}

	public int getFollowing()
	{
		return this.following;
	}

	public void setFollowing(int following)
	{
		this.following = following;
	}

	public int getNewfollower()
	{
		return this.newfollower;
	}

	public void setNewfollower(int newfollower)
	{
		this.newfollower = newfollower;
	}

	public int getNewmsg()
	{
		return this.newmsg;
	}

	public void setNewmsg(int newmsg)
	{
		this.newmsg = newmsg;
	}

	public int getNewat()
	{
		return this.newat;
	}

	public void setNewat(int newat)
	{
		this.newat = newat;
	}

	public int getNewcomment()
	{
		return this.newcomment;
	}

	public void setNewcomment(int newcomment)
	{
		this.newcomment = newcomment;
	}

}