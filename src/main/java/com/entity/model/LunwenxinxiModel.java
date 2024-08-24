package com.entity.model;

import com.entity.LunwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 论文信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public class LunwenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 论文题目
	 */
	
	private String lunwentimu;
		
	/**
	 * 期刊
	 */
	
	private String qikan;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 论文附件
	 */
	
	private String lunwenfujian;
		
	/**
	 * 发表日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabiaoriqi;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 论文介绍
	 */
	
	private String lunwenjieshao;
				
	
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
	 * 设置：论文题目
	 */
	 
	public void setLunwentimu(String lunwentimu) {
		this.lunwentimu = lunwentimu;
	}
	
	/**
	 * 获取：论文题目
	 */
	public String getLunwentimu() {
		return lunwentimu;
	}
				
	
	/**
	 * 设置：期刊
	 */
	 
	public void setQikan(String qikan) {
		this.qikan = qikan;
	}
	
	/**
	 * 获取：期刊
	 */
	public String getQikan() {
		return qikan;
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
	 * 设置：论文附件
	 */
	 
	public void setLunwenfujian(String lunwenfujian) {
		this.lunwenfujian = lunwenfujian;
	}
	
	/**
	 * 获取：论文附件
	 */
	public String getLunwenfujian() {
		return lunwenfujian;
	}
				
	
	/**
	 * 设置：发表日期
	 */
	 
	public void setFabiaoriqi(Date fabiaoriqi) {
		this.fabiaoriqi = fabiaoriqi;
	}
	
	/**
	 * 获取：发表日期
	 */
	public Date getFabiaoriqi() {
		return fabiaoriqi;
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
				
	
	/**
	 * 设置：论文介绍
	 */
	 
	public void setLunwenjieshao(String lunwenjieshao) {
		this.lunwenjieshao = lunwenjieshao;
	}
	
	/**
	 * 获取：论文介绍
	 */
	public String getLunwenjieshao() {
		return lunwenjieshao;
	}
			
}
