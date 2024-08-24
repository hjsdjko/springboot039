package com.dao;

import com.entity.KeyanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanxiangmuVO;
import com.entity.view.KeyanxiangmuView;


/**
 * 科研项目
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public interface KeyanxiangmuDao extends BaseMapper<KeyanxiangmuEntity> {
	
	List<KeyanxiangmuVO> selectListVO(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);
	
	KeyanxiangmuVO selectVO(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);
	
	List<KeyanxiangmuView> selectListView(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);

	List<KeyanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);

	
	KeyanxiangmuView selectView(@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanxiangmuEntity> wrapper);



}
