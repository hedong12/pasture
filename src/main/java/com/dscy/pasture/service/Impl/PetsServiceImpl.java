package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.entity.PetsExample;
import com.dscy.pasture.mapper.PetsMapper;
import com.dscy.pasture.service.PetsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsServiceImpl implements PetsService {

    @Autowired
    private PetsMapper petsMapper;

    @Override
    public PageInfo selectPetsList(Integer currentPage,String petsName) {
        PageHelper.startPage(currentPage,10);
        List<Pets> petsList = petsMapper.selectPetsList(petsName);
        PageInfo pageInfo = new PageInfo(petsList);
        return pageInfo;
    }

    @Override
    public Pets queryPetsById(Integer petsId) {
        Pets pets = petsMapper.selectByPrimaryKey(petsId);
        return pets;
    }

    @Override
    public int delPetsBypetsId(Integer petsId) {
        return petsMapper.deleteByPrimaryKey(petsId);
    }

    @Override
    public int addPets(Pets pets) {
        return petsMapper.insert(pets);
    }

    @Override
    public int updatePetsById(Pets pets) {
        return petsMapper.updateByPrimaryKeySelective(pets);
    }

    @Override
    public List<Pets> queryPetsList() {
        PetsExample example = new PetsExample();
        PetsExample.Criteria criteria = example.createCriteria();
        List<Pets> petsList = petsMapper.selectByExample(example);
        return petsList;
    }
}
