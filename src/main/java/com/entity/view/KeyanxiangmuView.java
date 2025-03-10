package com.entity.view;

import com.entity.KeyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 科研项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
@TableName("keyanxiangmu")
public class KeyanxiangmuView  extends KeyanxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyanxiangmuView(){
	}
 
 	public KeyanxiangmuView(KeyanxiangmuEntity keyanxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, keyanxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
