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


import com.dao.KeyanxiangmuDao;
import com.entity.KeyanxiangmuEntity;
import com.service.KeyanxiangmuService;
import com.entity.vo.KeyanxiangmuVO;
import com.entity.view.KeyanxiangmuView;

@Service("keyanxiangmuService")
public class KeyanxiangmuServiceImpl extends ServiceImpl<KeyanxiangmuDao, KeyanxiangmuEntity> implements KeyanxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyanxiangmuEntity> page = this.selectPage(
                new Query<KeyanxiangmuEntity>(params).getPage(),
                new EntityWrapper<KeyanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyanxiangmuEntity> wrapper) {
		  Page<KeyanxiangmuView> page =new Query<KeyanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KeyanxiangmuVO> selectListVO(Wrapper<KeyanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyanxiangmuVO selectVO(Wrapper<KeyanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyanxiangmuView> selectListView(Wrapper<KeyanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyanxiangmuView selectView(Wrapper<KeyanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KeyanxiangmuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KeyanxiangmuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KeyanxiangmuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
