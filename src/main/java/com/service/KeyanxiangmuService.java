package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanxiangmuView;


/**
 * 科研项目
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public interface KeyanxiangmuService extends IService<KeyanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanxiangmuVO> selectListVO(Wrapper<KeyanxiangmuEntity> wrapper);
   	
   	KeyanxiangmuVO selectVO(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);
   	
   	List<KeyanxiangmuView> selectListView(Wrapper<KeyanxiangmuEntity> wrapper);
   	
   	KeyanxiangmuView selectView(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanxiangmuEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KeyanxiangmuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KeyanxiangmuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KeyanxiangmuEntity> wrapper);



}

