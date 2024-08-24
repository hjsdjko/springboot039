package com.dao;

import com.entity.ZhuanlixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlixinxiVO;
import com.entity.view.ZhuanlixinxiView;


/**
 * 专利信息
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public interface ZhuanlixinxiDao extends BaseMapper<ZhuanlixinxiEntity> {
	
	List<ZhuanlixinxiVO> selectListVO(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	
	ZhuanlixinxiVO selectVO(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	
	List<ZhuanlixinxiView> selectListView(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);

	List<ZhuanlixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);

	
	ZhuanlixinxiView selectView(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	

}
