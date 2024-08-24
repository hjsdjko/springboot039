package com.dao;

import com.entity.ZhuanlileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlileixingVO;
import com.entity.view.ZhuanlileixingView;


/**
 * 专利类型
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:44:16
 */
public interface ZhuanlileixingDao extends BaseMapper<ZhuanlileixingEntity> {
	
	List<ZhuanlileixingVO> selectListVO(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
	ZhuanlileixingVO selectVO(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
	List<ZhuanlileixingView> selectListView(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);

	List<ZhuanlileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);

	
	ZhuanlileixingView selectView(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	

}
