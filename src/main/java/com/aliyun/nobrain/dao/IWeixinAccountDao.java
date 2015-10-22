package com.aliyun.nobrain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aliyun.nobrain.entity.WeixinAccountVO;
@Repository
public interface IWeixinAccountDao {
	public WeixinAccountVO getById(String id);
	
	public WeixinAccountVO getByAccount(String account);
	
	public WeixinAccountVO getSingleAccount();

	public List<WeixinAccountVO> listForPage(WeixinAccountVO searchEntity);

	public void add(WeixinAccountVO entity);

	public void update(WeixinAccountVO entity);

	public void delete(WeixinAccountVO entity);
}
