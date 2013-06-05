package org.chingo.gutcom.action.api.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.chingo.gutcom.action.base.api.common.NoticeBaseAction;
import org.chingo.gutcom.common.constant.SyslogConst;
import org.chingo.gutcom.common.constant.UserConst;
import org.chingo.gutcom.common.util.ErrorCodeUtil;
import org.chingo.gutcom.common.util.WebUtil;
import org.chingo.gutcom.domain.CommonSyslog;
import org.chingo.gutcom.domain.CommonUser;

public class NoticeAction extends NoticeBaseAction
{
	private String type; // 计数信息类型
	// JSON响应数据
	private Map<String, Object> jsonRst = new HashMap<String, Object>();
	
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Map<String, Object> getJsonRst()
	{
		return jsonRst;
	}

	public void setJsonRst(Map<String, Object> jsonRst)
	{
		this.jsonRst = jsonRst;
	}

	/**
	 * 获取各种计数Method
	 * @return Action Result
	 * @throws Exception
	 */
	public String fetchCount() throws Exception
	{
		jsonRst.clear(); // 清空响应数据
		// 查询用户
		CommonUser user = userMgr.getUser(WebUtil.getUser(session).getUid());
		if(user != null) // 用户存在时
		{
			/* 设置响应数据 */
			jsonRst.put("newfollower", user.getNewfollower());
			jsonRst.put("newmsg", user.getNewmsg());
			jsonRst.put("newat", user.getNewat());
			jsonRst.put("newcomment", user.getNewcomment());
		}
		else // 返回用户不存在错误信息
		{
			jsonRst = ErrorCodeUtil.createErrorJsonRst(ErrorCodeUtil.CODE_20002,
					WebUtil.getRequestAddr(request), null);
		}
		return SUCCESS;
	}
	
	/**
	 * 清零未读信息计数Method
	 * @return Action Result
	 * @throws Exception
	 */
	public String resetCount() throws Exception
	{
		jsonRst.clear(); // 清空响应数据
		// 检查参数
		if(type!=null && (type.equals(UserConst.CNT_NEWAT)
				|| type.equals(UserConst.CNT_NEWCOMMENT)
				|| type.equals(UserConst.CNT_NEWFOLLOWER)
				|| type.equals(UserConst.CNT_NEWMSG)))
		{
			/* 创建日志对象 */
			CommonSyslog log = new CommonSyslog();
			log.setDateline(new Date().getTime());
			log.setDetail(SyslogConst.DETAIL_USER_CNT_NEW_RESET);
			log.setIp(WebUtil.getRemoteAddr(request));
			log.setType(SyslogConst.TYPE_OP_FRONT);
			log.setUserid(WebUtil.getUser(session).getUid());
			// 清零成功时
			if(userMgr.resetNewCount(type, log) == true)
			{
				jsonRst.put("result", true);
			}
			else // 否则返回对象不存在错误信息
			{
				jsonRst = ErrorCodeUtil.createErrorJsonRst(ErrorCodeUtil.CODE_20002,
						WebUtil.getRequestAddr(request), null);
			}
		}
		else // 返回参数错误信息
		{
			jsonRst = ErrorCodeUtil.createErrorJsonRst(ErrorCodeUtil.CODE_10008,
					WebUtil.getRequestAddr(request), null);
		}
		return SUCCESS;
	}
}