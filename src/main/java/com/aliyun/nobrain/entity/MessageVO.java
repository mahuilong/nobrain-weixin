package com.aliyun.nobrain.entity;

import java.io.Serializable;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="xml")
public class MessageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6420066184822705173L;
	private Long id;
	private Long seqNO;
	private String requestContent;
	private Date requestDate;
	private String requestUri;
	private String toUserName;

	private String fromUserName;
	private Long createTime;

	private String msgType;

	private String content;

	private String msgId;

	private String picUrl;

	private String mediaId;

	private String format;

	private String thumbMediaId;
	private Double locationX;

	private Double locationY;

	private Double scale;

	private String label;

	private String title;

	private String description;

	private String url;

	private String event;

	private String eventKey;

	private String ticket;

	private Double latitude;

	private Double longitude;

	private Double precision;

	private String recognition;
	
	@XmlElement
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@XmlElement
	public Long getSeqNO() {
		return seqNO;
	}
	public void setSeqNO(Long seqNO) {
		this.seqNO = seqNO;
	}
	@XmlElement
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	@XmlElement
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	@XmlElement
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	@XmlElement(value="ToUserName")
	public String getToUserName() {
		return toUserName;
	}
	@XmlElement(value="ToUserName")
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	@XmlElement
	public String getFromUserName() {
		return fromUserName;
	}
	@XmlElement
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	@XmlElement
	public Long getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	@XmlElement
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	@XmlElement
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@XmlElement
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	@XmlElement
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	@XmlElement
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	@XmlElement
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	@XmlElement
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	@XmlElement
	public Double getLocationX() {
		return locationX;
	}
	public void setLocationX(Double locationX) {
		this.locationX = locationX;
	}
	@XmlElement
	public Double getLocationY() {
		return locationY;
	}
	public void setLocationY(Double locationY) {
		this.locationY = locationY;
	}
	@XmlElement
	public Double getScale() {
		return scale;
	}
	public void setScale(Double scale) {
		this.scale = scale;
	}
	@XmlElement
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@XmlElement
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	@XmlElement
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	@XmlElement
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	@XmlElement
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	@XmlElement
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@XmlElement
	public Double getPrecision() {
		return precision;
	}
	public void setPrecision(Double precision) {
		this.precision = precision;
	}
	@XmlElement
	public String getRecognition() {
		return recognition;
	}
	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}
	
}
