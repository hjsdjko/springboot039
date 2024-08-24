package com.entity.vo;

import com.entity.KeyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科研项目
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public class KeyanxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 项目图片
	 */
	
	private String xiangmutupian;
		
	/**
	 * 项目进度
	 */
	
	private String xiangmujindu;
		
	/**
	 * 项目经费
	 */
	
	private Double xiangmujingfei;
		
	/**
	 * 科研成果
	 */
	
	private String keyanchengguo;
		
	/**
	 * 项目附件
	 */
	
	private String xiangmufujian;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：项目分类
	 */
	 
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
				
	
	/**
	 * 设置：项目图片
	 */
	 
	public void setXiangmutupian(String xiangmutupian) {
		this.xiangmutupian = xiangmutupian;
	}
	
	/**
	 * 获取：项目图片
	 */
	public String getXiangmutupian() {
		return xiangmutupian;
	}
				
	
	/**
	 * 设置：项目进度
	 */
	 
	public void setXiangmujindu(String xiangmujindu) {
		this.xiangmujindu = xiangmujindu;
	}
	
	/**
	 * 获取：项目进度
	 */
	public String getXiangmujindu() {
		return xiangmujindu;
	}
				
	
	/**
	 * 设置：项目经费
	 */
	 
	public void setXiangmujingfei(Double xiangmujingfei) {
		this.xiangmujingfei = xiangmujingfei;
	}
	
	/**
	 * 获取：项目经费
	 */
	public Double getXiangmujingfei() {
		return xiangmujingfei;
	}
				
	
	/**
	 * 设置：科研成果
	 */
	 
	public void setKeyanchengguo(String keyanchengguo) {
		this.keyanchengguo = keyanchengguo;
	}
	
	/**
	 * 获取：科研成果
	 */
	public String getKeyanchengguo() {
		return keyanchengguo;
	}
				
	
	/**
	 * 设置：项目附件
	 */
	 
	public void setXiangmufujian(String xiangmufujian) {
		this.xiangmufujian = xiangmufujian;
	}
	
	/**
	 * 获取：项目附件
	 */
	public String getXiangmufujian() {
		return xiangmufujian;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
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
