package com.entity.view;

import com.entity.ZhuanlileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 专利类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
@TableName("zhuanlileixing")
public class ZhuanlileixingView  extends ZhuanlileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanlileixingView(){
	}
 
 	public ZhuanlileixingView(ZhuanlileixingEntity zhuanlileixingEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanlileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
