package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Prize;
import com.dscy.pasture.entity.PrizeExample;
import com.dscy.pasture.mapper.PrizeMapper;
import com.dscy.pasture.service.PrizeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrizeServiceImpl implements PrizeService {

    @Autowired
    private PrizeMapper prizeMapper;

    @Override
    public PageInfo getPrizeList(Integer cuttentPage, String prizeName) {
        PrizeExample example = new PrizeExample();
        PrizeExample.Criteria criteria = example.createCriteria();
        if (prizeName != null || !prizeName.equals("")) {
            criteria.andPrizeNameLike('%'+prizeName+'%');
        }
        PageHelper.startPage(cuttentPage,10);
        List<Prize> prizeList = prizeMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(prizeList);
        return pageInfo;
    }

    @Override
    public Prize selectPrizeById(Integer id) {
        return prizeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delPrizeById(Integer getpId) {
        return prizeMapper.deleteByPrimaryKey(getpId);
    }


    @Override
    public int doUpdatePrizeById(Prize prize) {
        return prizeMapper.updateByPrimaryKey(prize);
    }

    @Override
    public int addPrize(Prize prize) {
        return prizeMapper.insert(prize);
    }
}
