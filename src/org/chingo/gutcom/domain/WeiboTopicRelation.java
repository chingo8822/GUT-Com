package org.chingo.gutcom.domain;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

// Generated Apr 14, 2013 10:15:06 PM by Hibernate Tools 4.0.0

/**
 * WeiboTopicRelation generated by hbm2java
 */
public class WeiboTopicRelation implements java.io.Serializable
{

	private String id; // rowKey，关系ID
	private String topicTitle; // 话题标题
	private String weiboId; // 微博ID

	public WeiboTopicRelation()
	{
	}

	public WeiboTopicRelation(String id, String topicTitle, String weiboId)
	{
		this.id = id;
		this.topicTitle = topicTitle;
		this.weiboId = weiboId;
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTopicTitle()
	{
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle)
	{
		this.topicTitle = topicTitle;
	}

	public String getWeiboId()
	{
		return weiboId;
	}

	public void setWeiboId(String weiboId)
	{
		this.weiboId = weiboId;
	}

	/**
	 * 根据Result填充字段
	 * @param rst 填充数据源Result
	 */
	public void fillByResult(Result rst)
	{
		this.setId(Bytes.toString(rst.getRow()));
		this.setTopicTitle(Bytes.toString(rst.getValue(Bytes.toBytes("info"),
				Bytes.toBytes("topic_title"))));
		this.setWeiboId(Bytes.toString(rst.getValue(Bytes.toBytes("info"),
				Bytes.toBytes("weiboid"))));
	}
}
