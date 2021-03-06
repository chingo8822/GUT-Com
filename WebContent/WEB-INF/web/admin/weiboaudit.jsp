<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微博审核</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin/style.css"
	media="all">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/admin/general.js"></script>
</head>
<body>
	<div class="nav">当前位置：微博管理 -&gt; 微博审核</div>
	<div class="mgrlist">
		<s:form id="formList" action="weiboAction.do" namespace="/admin">
			<table>
				<tr>
					<th><input id="checkAll" type="checkbox" /></th>
					<th style="width: 100px;">作者</th>
					<th>内容</th>
					<th>所在话题</th>
					<th>发表时间</th>
					<th>状态</th>
					<th>可见性</th>
					<th>操作</th>
				</tr>
				<s:iterator var="w" value="#request.lstWeibo">
					<tr>
						<td><input name="checkbox" class="checkbox" type="checkbox"
							value='<s:property value="#w.wid" />' /></td>
						<td style="text-align: center;"><s:property
								value="#w.commonUser.nickname" /></td>
						<td><s:property value="#w.content" /></td>
						<td><s:if test="#w.weiboTopicRelations == null">
								<i>无</i>
							</s:if>
							<s:else>
								<s:iterator var="topic"
									value="#w.weiboTopicRelations.weiboTopic">
									<s:property value="#topic.title" />&nbsp;&nbsp;
							</s:iterator>
							</s:else></td>
						<td><s:text name="format.datetime">
								<s:param value="#w.dateline" />
							</s:text></td>
						<td><s:if test="#w.status==0">未审核</s:if> <s:elseif
								test="#w.status==1">已审核</s:elseif></td>
						<td><s:if test="#w.visibility==0">公开</s:if> <s:elseif
								test="#w.visibility==1">关注可见</s:elseif></td>
						<td><s:url action="weiboshow" id="showurl">
								<s:param name="id">
									<s:property value="#w.wid" />
								</s:param>
							</s:url> <s:a href="%{showurl}">查看</s:a> <s:url
								action="weiboupdateStatus" id="updatestatusurl">
								<s:param name="id">
									<s:property value="#w.wid" />
								</s:param>
								<s:param name="status">
									<s:property value="#w.status" />
								</s:param>
							</s:url> <s:a href="%{updatestatusurl}">
								<s:if test="#w.status==0">
						审核微博</s:if>
							</s:a> <s:url action="weibodel" id="delurl">
								<s:param name="id">
									<s:property value="#w.wid" />
								</s:param>
							</s:url> <s:a cssClass="delete" href="%{delurl}">删除</s:a></td>
					</tr>
				</s:iterator>
			</table>
			选中项操作：<s:submit cssClass="delete" value="删除选中" method="del" />
			<s:submit value="审核选中" method="audit" />
			<div class="pager">
					<s:url action="weibomgr" id="mgrurl">
						<s:param name="searchMode">
							1
						</s:param>
						<s:param name="status">0</s:param>
					</s:url>
				<s:if test="#request.pageCount > 1">
					<s:a href="%{mgrurl}">首页</s:a>
				</s:if>
				<s:if test="#request.pageCount > 1">
					<s:a href="%{mgrurl}&p=%{pageCount-1}">上一页</s:a>
				</s:if>
				<s:if test="#request.pageCount < #request.pageSize">
					<s:a href="%{mgrurl}&p=%{pageCount+1}">下一页</s:a>
				</s:if>
				<s:if test="#request.pageCount != #request.pageSize">
					<s:a href="%{mgrurl}&p=%{pageSize}">尾页</s:a>
				</s:if>
				当前第
				<s:property value="%{pageCount}" />
				页 <input type="text" id="txtPage" class="txtPage" name="p"
					style="width: 30px;" onkeypress="return txtPageKeyPress(event);" />
				<s:submit id="goto" value="跳转" method="mgr"
					onclick="return checkPage(%{pageSize});" />
				共
				<s:property value="%{pageSize}" />
				页 总计
				<s:property value="%{totalSize}" />
				条记录
			</div>
		</s:form>
	</div>
</body>
</html>