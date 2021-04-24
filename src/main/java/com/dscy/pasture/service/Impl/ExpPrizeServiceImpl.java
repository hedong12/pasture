package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ExpPrize;
import com.dscy.pasture.entity.ExpPrizeExample;
import com.dscy.pasture.mapper.ExpPrizeMapper;
import com.dscy.pasture.service.ExpPrizeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpPrizeServiceImpl implements ExpPrizeService {

    @Autowired
    private ExpPrizeMapper expPrizeMapper;

    @Override
    public PageInfo getExpPrizeList(String expPrizeName,Integer currentPage) {
        ExpPrizeExample example = new ExpPrizeExample();
        ExpPrizeExample.Criteria criteria = example.createCriteria();
        if (expPrizeName != null && !expPrizeName.equals("")){
            criteria.andExpPrizeNameLike('%'+expPrizeName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ExpPrize> expPrizeList = expPrizeMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(expPrizeList);
        return pageInfo;
    }

    @Override
    public ExpPrize selectExpPrizeById(Integer eId) {
        return expPrizeMapper.selectByPrimaryKey(eId);
    }

    @Override
    public int delExpPrizeById(Integer eId) {
        return expPrizeMapper.deleteByPrimaryKey(eId);
    }

    @Override
    public int addExpPrize(ExpPrize expPrize) {
        return expPrizeMapper.insert(expPrize);
    }

    @Override
    public int doUpdateExpPrizeById(ExpPrize expPrize) {
        return expPrizeMapper.updateByPrimaryKey(expPrize);
    }

    @Override
    public int updateExpPrizeByExpId(Integer fodderId, String fodderName, String fodderImgUrl) {
        return expPrizeMapper.updateExpPrizeByExpId(fodderId,fodderName,fodderImgUrl);
    }

    @Override
    public List<ExpPrize> getPetsExpPrizeList() {
        ExpPrizeExample example = new ExpPrizeExample();
        ExpPrizeExample.Criteria criteria = example.createCriteria();
        return expPrizeMapper.selectByExample(example);
    }

}
