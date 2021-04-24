package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ShouyiZhonglei;
import com.dscy.pasture.entity.ShouyiZhongleiExample;
import com.dscy.pasture.mapper.ShouyiZhongleiMapper;
import com.dscy.pasture.service.ShouyiZhongleiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ShouyiZhongleiServiceImpl implements ShouyiZhongleiService {

    @Autowired
    private ShouyiZhongleiMapper shouyiZhongleiMapper;


    @Override
    public PageInfo getRevenueTypeList(Integer currentPage, String szName) {
        ShouyiZhongleiExample example = new ShouyiZhongleiExample();
        ShouyiZhongleiExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(szName)) {
            criteria.andSzNameLike('%'+szName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ShouyiZhonglei> shouyiZhongleiList = shouyiZhongleiMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(shouyiZhongleiList);
        return pageInfo;
    }

    @Override
    public ShouyiZhonglei selectRTypeById(Integer id) {
        return shouyiZhongleiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delRTypeById(Integer szId) {
        return shouyiZhongleiMapper.deleteByPrimaryKey(szId);
    }

    @Override
    public int addRevenueTyper(ShouyiZhonglei shouyiZhonglei) {
        return shouyiZhongleiMapper.insert(shouyiZhonglei);
    }

    @Override
    public int doUpdateRevenueTypeById(ShouyiZhonglei shouyiZhonglei) {
        return shouyiZhongleiMapper.updateByPrimaryKey(shouyiZhonglei);
    }

    @Override
    public List<ShouyiZhonglei> selectZhongLeiList() {
        ShouyiZhongleiExample example = new ShouyiZhongleiExample();
        ShouyiZhongleiExample.Criteria criteria = example.createCriteria();
        return shouyiZhongleiMapper.selectByExample(example);
    }
}
