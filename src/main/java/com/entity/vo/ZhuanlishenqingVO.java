package com.entity.vo;

import com.entity.ZhuanlishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专利申请
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public class ZhuanlishenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专利名称
	 */
	
	private String zhuanlimingcheng;
		
	/**
	 * 专利类型
	 */
	
	private String zhuanlileixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 资料附件
	 */
	
	private String ziliaofujian;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：专利名称
	 */
	 
	public void setZhuanlimingcheng(String zhuanlimingcheng) {
		this.zhuanlimingcheng = zhuanlimingcheng;
	}
	
	/**
	 * 获取：专利名称
	 */
	public String getZhuanlimingcheng() {
		return zhuanlimingcheng;
	}
				
	
	/**
	 * 设置：专利类型
	 */
	 
	public void setZhuanlileixing(String zhuanlileixing) {
		this.zhuanlileixing = zhuanlileixing;
	}
	
	/**
	 * 获取：专利类型
	 */
	public String getZhuanlileixing() {
		return zhuanlileixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：资料附件
	 */
	 
	public void setZiliaofujian(String ziliaofujian) {
		this.ziliaofujian = ziliaofujian;
	}
	
	/**
	 * 获取：资料附件
	 */
	public String getZiliaofujian() {
		return ziliaofujian;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
