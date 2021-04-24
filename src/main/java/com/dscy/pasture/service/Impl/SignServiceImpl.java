package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Sign;
import com.dscy.pasture.entity.SignExample;
import com.dscy.pasture.mapper.SignMapper;
import com.dscy.pasture.service.SignService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;

    @Override
    public PageInfo getSignList(Integer currentPage, String signName, String expPrizeName) {
        SignExample example = new SignExample();
        SignExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(signName)) {
            criteria.andSignNameLike('%'+signName+'%');
        }
        if (!StringUtils.isEmpty(expPrizeName)) {
            criteria.andExpPrizeNameLike('%'+expPrizeName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<Sign> signList = signMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(signList);
        return pageInfo;
    }

    @Override
    public Sign getSignById(Integer id) {
        return signMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delSignById(Integer getsId) {
        return signMapper.deleteByPrimaryKey(getsId);
    }

}
