package com.aliyun.nobrain.context;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.aliyun.nobrain.entity.MessageVO;

/**
 * xml 消息处理工具类
 * 
 */
@SuppressWarnings("unchecked")
public class WeixinXmlUtil {



	//将request 消息 转换成 请求消息对象
	
	public static MessageVO parseXml(HttpServletRequest request) throws Exception {
		MessageVO msgReq = new MessageVO();
		
		// 解析XML
		InputStream inputStream = request.getInputStream();
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		Element root = document.getRootElement();
		
		List<Element> elementList = root.elements();
		
		// 遍历节点，封装成对象
		for (Element e : elementList){
			String name = e.getName();
			String text = e.getText();
			
			if("MsgType".equals(name)){
				msgReq.setMsgType(text);
			}else if("MsgId".equals(name)){
				msgReq.setMsgId(text);
			}else if("MsgId".equals(name)){
				msgReq.setMsgId(text);
			}else if("FromUserName".equals(name)){
				msgReq.setFromUserName(text);
			}else if("ToUserName".equals(name)){
				msgReq.setToUserName(text);
			}else if("Content".equals(name)){//文本消息
				msgReq.setContent(text);
			}else if("PicUrl".equals(name)){//图片消息
				msgReq.setPicUrl(text);
			}else if("Label".equals(name)){
				msgReq.setLabel(text);
			}else if("Event".equals(name)){//事件消息
				msgReq.setEvent(text);
			}else if("EventKey".equals(name)){
				msgReq.setEventKey(text);
			}
		}
		
		inputStream.close();
		inputStream = null;
		return msgReq;
	}
	
	
}
