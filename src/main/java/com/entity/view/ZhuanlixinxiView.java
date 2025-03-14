package com.entity.view;

import com.entity.ZhuanlixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 专利信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
@TableName("zhuanlixinxi")
public class ZhuanlixinxiView  extends ZhuanlixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanlixinxiView(){
	}
 
 	public ZhuanlixinxiView(ZhuanlixinxiEntity zhuanlixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanlixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
