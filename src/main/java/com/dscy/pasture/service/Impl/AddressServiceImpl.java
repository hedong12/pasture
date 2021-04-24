package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Address;
import com.dscy.pasture.entity.AddressExample;
import com.dscy.pasture.mapper.AddressMapper;
import com.dscy.pasture.service.AddressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {


    @Autowired
    private AddressMapper addressMapper;

    @Override
    public PageInfo getAddressList(Integer currentPage, String username) {
        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<Address> addressList = addressMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(addressList);
        return pageInfo;
    }

    @Override
    public Address selectAddressById(Integer id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delAddressById(Integer addressId) {
        return addressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public int doUpdateAddressById(Address address) {
        return addressMapper.updateByPrimaryKey(address);
    }
}
