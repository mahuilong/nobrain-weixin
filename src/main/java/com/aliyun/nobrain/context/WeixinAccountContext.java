package com.aliyun.nobrain.context;

import java.util.HashMap;
import java.util.Map;

import com.aliyun.nobrain.entity.WeixinAccountVO;
/**
 * 全局容器，类似于缓存，保存公众号，不需要每次从数据库中读取公众账号
 */

public class WeixinAccountContext {


	private static Map<String,WeixinAccountVO> accountMap = new HashMap<String,WeixinAccountVO>();
	
	public static void addAccount(WeixinAccountVO account){
		if(account != null && !accountMap.containsKey(account.getAccount())){
			accountMap.put(account.getAccount(), account);
		}
	}
	
	public static void updateAccount(WeixinAccountVO account){
		if(account != null && !accountMap.containsKey(account.getAccount())){
			accountMap.put(account.getAccount(), account);
		}
	}
	
	public static WeixinAccountVO getAccount(String account){
		return accountMap.get(account);
	}
	
	public static WeixinAccountVO getSingleAccount(){
		WeixinAccountVO sigleAccount = null;
		for(String key : accountMap.keySet()){
			sigleAccount = accountMap.get(key);
			break;
		}
		return sigleAccount;
	}
	

}
