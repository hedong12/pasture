package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ShouyiLiushui;
import com.dscy.pasture.entity.ShouyiLiushuiExample;
import com.dscy.pasture.mapper.ShouyiLiushuiMapper;
import com.dscy.pasture.service.ShouyiLiushuiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ShouyiLiushuiServiceImpl implements ShouyiLiushuiService {


    @Autowired
    private ShouyiLiushuiMapper shouyiLiushuiMapper;

    @Override
    public PageInfo getRevenueLiushuiList(Integer currentPage, String username, String szName) {
        ShouyiLiushuiExample example = new ShouyiLiushuiExample();
        ShouyiLiushuiExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(szName)) {
            criteria.andSzNameLike('%'+szName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ShouyiLiushui> shouyiLiushuiList = shouyiLiushuiMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(shouyiLiushuiList);
        return pageInfo;
    }
}
