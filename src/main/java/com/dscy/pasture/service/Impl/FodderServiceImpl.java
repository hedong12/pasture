package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.entity.FodderExample;
import com.dscy.pasture.mapper.FodderMapper;
import com.dscy.pasture.service.FodderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FodderServiceImpl implements FodderService {

    @Autowired
    private FodderMapper fodderMapper;

    @Override
    public PageInfo getFodderList(String fodderName,Integer current) {
        FodderExample example = new FodderExample();
        FodderExample.Criteria criteria = example.createCriteria();
        if (fodderName != null && !fodderName.equals("")){
            criteria.andFodderNameLike('%'+fodderName+'%');
        }
        PageHelper.startPage(current,10);
        List<Fodder> fodderList = fodderMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(fodderList);
        return pageInfo;
    }

    @Override
    public Fodder selectFooderById(Integer fodderId) {
        return fodderMapper.selectByPrimaryKey(fodderId);
    }

    @Override
    public int delFodderById(Integer fodderId) {
        return fodderMapper.deleteByPrimaryKey(fodderId);
    }

    @Override
    public List<Fodder> getExpPrizeFodderList() {
        FodderExample example = new FodderExample();
        FodderExample.Criteria criteria = example.createCriteria();
        List<Fodder> fodderList = fodderMapper.selectByExample(example);
        return fodderList;
    }

    @Override
    public int doUpdateFodderById(Fodder fodder) {
        return fodderMapper.updateByPrimaryKey(fodder);
    }

    @Override
    public int doAddFodder(Fodder fodder) {
        return fodderMapper.insert(fodder);
    }

}
