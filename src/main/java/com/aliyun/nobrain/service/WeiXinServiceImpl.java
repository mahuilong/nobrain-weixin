package com.aliyun.nobrain.service;

import org.springframework.stereotype.Component;

import com.aliyun.nobrain.context.SignatureUtil;
import com.aliyun.nobrain.entity.MessageVO;
import com.aliyun.nobrain.entity.Token;
import com.aliyun.nobrain.entity.User;
@Component
public class WeiXinServiceImpl implements WeiXinService {

	private static final String tokenId = "123456";//获取token，进行验证；

    
	@Override
	public String doGet(Token token) {
		String signature = token.getSignature();// 微信加密签名
		String timestamp = token.getTimestamp();// 时间戳
		String nonce = token.getNonce();// 随机数
		String echostr = token.getEchostr();// 随机字符串
		
		// 校验成功返回  echostr，成功成为开发者；否则返回error，接入失败
		if (SignatureUtil.validSign(signature, tokenId, timestamp, nonce)) {
			return echostr;
		}
		return "error";
	}


	@Override
	public MessageVO doPost(MessageVO messageVO) {
		System.out.println(messageVO.getToUserName());
		messageVO.setToUserName("marzone");
		return messageVO;
	}
	
	@Override
	public User test(User user){
		System.out.println(user.getNickname());
		return user;
	}
	

}
