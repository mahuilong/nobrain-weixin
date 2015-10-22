package com.aliyun.nobrain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aliyun.nobrain.entity.MessageVO;
import com.aliyun.nobrain.entity.PageVO;
@Repository
public interface IMessageDao {

	public int createMessageHis(MessageVO messageVO) throws Exception;
	
	public List<MessageVO> findMessageHisList(MessageVO messageVO)throws Exception;
	
	public int createMessage(MessageVO messageVO)throws Exception;
	
	public List<MessageVO> findMessageList(MessageVO messageVO) throws Exception;
	
	public List<MessageVO> getMessage(MessageVO messageVO)throws Exception;
	
	public List<MessageVO> getMessageForWall(PageVO pageVO)throws Exception;
	
	public List<MessageVO> getEndMessage(PageVO pageVO)throws Exception;
}
