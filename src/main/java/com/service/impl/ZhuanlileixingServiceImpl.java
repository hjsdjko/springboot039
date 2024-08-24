package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuanlileixingDao;
import com.entity.ZhuanlileixingEntity;
import com.service.ZhuanlileixingService;
import com.entity.vo.ZhuanlileixingVO;
import com.entity.view.ZhuanlileixingView;

@Service("zhuanlileixingService")
public class ZhuanlileixingServiceImpl extends ServiceImpl<ZhuanlileixingDao, ZhuanlileixingEntity> implements ZhuanlileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanlileixingEntity> page = this.selectPage(
                new Query<ZhuanlileixingEntity>(params).getPage(),
                new EntityWrapper<ZhuanlileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanlileixingEntity> wrapper) {
		  Page<ZhuanlileixingView> page =new Query<ZhuanlileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuanlileixingVO> selectListVO(Wrapper<ZhuanlileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanlileixingVO selectVO(Wrapper<ZhuanlileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanlileixingView> selectListView(Wrapper<ZhuanlileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanlileixingView selectView(Wrapper<ZhuanlileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
